class Solution {
    public boolean doesAliceWin(String s) {
        char[] ch=s.toCharArray();
        for(char str:ch){
            if(str=='a'|| str=='e' || str=='i' || str=='o' || str=='u' || str=='A'|| str=='E' || str=='I' || str=='O' || str=='U' ){
                return true;
            }
        }
        return false;
    }
}