class Solution {
    public int[][] imageSmoother(int[][] img) {

        int n = img.length;
        int m = img[0].length;

        int[][] ans = new int[n][m];

        // 8 directions + current cell
        int[][] dir = {
            {-1, -1}, 
            {-1, 0}, 
            {-1, 1},
            { 0, -1},
            { 0, 1},
            { 1, -1}, 
            { 1, 0}, 
            { 1, 1}
        };

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                int sum = img[i][j];
                int count = 1;

                // Visit all 8 dir
                for (int k = 0; k < 8; k++) {

                    int nr = i + dir[k][0];
                    int nc = j + dir[k][1];

                    // bundary check
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                        sum += img[nr][nc];
                        count++;
                    }
                }

                ans[i][j] = sum / count;
            }
        }

        return ans;
    }
}