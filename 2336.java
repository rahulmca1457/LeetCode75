class SmallestInfiniteSet {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    HashSet<Integer> set = new HashSet<>();
    int n = 1;
    public SmallestInfiniteSet() {
        
    }
    
    public int popSmallest() {
        if(pq.size()>0){
            set.remove(pq.peek());
            return pq.poll();
        }
        n++;
        return n-1;
    }
    
    public void addBack(int num) {
        if(num<n){
            if(!set.contains(num)){
                pq.offer(num);
                set.add(num);
            }
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
