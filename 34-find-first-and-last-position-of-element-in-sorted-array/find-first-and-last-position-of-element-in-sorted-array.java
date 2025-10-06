class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int m=-1 , n=-1;
        for(int i=0;i<len;i++){
            if(nums[i]==target){
                m=i;
                break;
            }
        }
        for(int j=len-1;j>=0;j--){
            if(nums[j]==target){
                n=j;
                break;
            }
        }
        return new int[]{m,n};
    }
}