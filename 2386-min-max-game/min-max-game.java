class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
            int n=nums.length;
            int[] res=new int[n/2];
            for (int i=0;i<res.length;i++){
                if(i%2 ==0){
                    res[i]=Math.min(nums[2*i], nums[2*i+1]);
                } else{
                    res[i]=Math.max(nums[2*i], nums[2*i+1]);
                }
            }
            nums=res;
        }
        return nums[0];
    }
}