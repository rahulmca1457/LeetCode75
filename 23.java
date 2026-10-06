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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode res = new ListNode(0);
        for(int i=0;i<lists.length;i++){
            ListNode temp = new ListNode();
            temp = lists[i];
            while(temp!=null){
                pq.offer(temp.val);
                temp = temp.next;
            }
        }
        ListNode dummy = new ListNode();
        dummy = res;
        while(!pq.isEmpty()){
            ListNode t2 = new ListNode(pq.poll());
            res.next = t2;
            res = res.next;
        }
        return dummy.next;
    }
}
