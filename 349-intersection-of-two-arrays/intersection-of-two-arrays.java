
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m=nums1.length;
        int n=nums2.length;
        int[] temp = new int[Math.min(m, n)];
        int idx = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (idx == 0 || temp[idx - 1] != nums1[i]) {
                    temp[idx++] = nums1[i];
                }
                // i++;
                j++;
            }
        }
        int[] res = new int[idx];
        for (int k = 0; k < idx; k++) {
            res[k] = temp[k];
        }
        
        return res;
    }
}