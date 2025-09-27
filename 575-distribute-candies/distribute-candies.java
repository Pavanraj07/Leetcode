class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int n=candyType.length;
        int count=1; 
        
        for(int i=1;i<n;i++){
            if (candyType[i]!=candyType[i-1]){
                count++;
            }
        }
        int max = n/2;

        return Math.min(count, max);
    }
}