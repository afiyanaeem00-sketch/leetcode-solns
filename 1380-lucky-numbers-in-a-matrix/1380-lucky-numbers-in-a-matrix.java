class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        // Find minimum in each row
        for (int i = 0; i < m; i++) {

            int min = matrix[i][0];
            int MCI = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    MCI = j;
                }
            }

            // Check if this minimum is maximum in its column
            boolean flag = true;

            for (int j = 0; j < m; j++) {
                if (matrix[j][MCI] > min) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans.add(min);
            }
        }

        return ans;
    }
}