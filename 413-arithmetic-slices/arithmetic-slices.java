class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        int c=0;
        int cur=0;
        for(int i=1;i<n-1;i++){
            if(nums[i]-nums[i-1]==nums[i+1]-nums[i]){
                c++;
                cur+=c;
            }else c=0;
        }
        return cur;
    }
}