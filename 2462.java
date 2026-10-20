class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int i = 0;
        int j = costs.length-1;
        long totalcost = 0;
        while(k>0){
            while(i<=j && i<costs.length && left.size()<candidates){
                left.offer(costs[i]);
                i++;
            }
            while(i<=j && j>=0 && right.size()<candidates){
                right.offer(costs[j]);
                j--;
            }
            if(!left.isEmpty() && right.isEmpty() || !left.isEmpty() && left.peek()<=right.peek()){
                totalcost += left.poll();
            }
            else if(!right.isEmpty()){
                totalcost += right.poll();
            }
            k--;
        }
        return totalcost;
    }
}
