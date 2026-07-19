class Solution {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];         
        boolean[] freq = new boolean[26]; 
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            count[idx]--; 
            if (freq[idx]) continue;
            while (res.length() > 0 &&
                   ch < res.charAt(res.length() - 1) &&
                   count[res.charAt(res.length() - 1) - 'a'] > 0) {
                freq[res.charAt(res.length() - 1) - 'a'] = false;
                res.deleteCharAt(res.length() - 1);
            }
            res.append(ch);
            freq[idx] = true;
        }
        return res.toString();
    }
}