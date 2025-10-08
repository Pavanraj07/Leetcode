class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                q.add(matrix[i][j]);
            }
        }

        int res = -1;
        for(int i=0; i<k; i++) {
            res = q.poll();
        }

        return res;
    }
}