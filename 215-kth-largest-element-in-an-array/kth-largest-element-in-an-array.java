class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq= new PriorityQueue<>();
    //    for(int i=0; i<nums.length; i++){
    //        pq.offer(nums[i]);
    //        if(pq.size() > k){
    //         pq.remove();
    //        }
    //    }
    //     return pq.peek();

    Arrays.sort(nums);
    int ans = nums[nums.length-k];
    return ans;
    }
}