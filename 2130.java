/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev1 = head;
        ListNode prev2 = null;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            prev1.next = prev2;
            prev2 = prev1;
            prev1 = slow;
        }
        while(prev1!=null){
            max = Math.max(max,(prev1.val+prev2.val));
            prev1 = prev1.next;
            prev2 = prev2.next;
        }
        return max;
    }
}
