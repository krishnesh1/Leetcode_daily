// Last updated: 21/07/2026, 23:15:03
class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        vector<vector<int>> arr(n, vector<int>(n));

        for (int i = 0; i < n; i++) {
            int s = n - 1;
            for (int j = 0; j < n; j++) {
                arr[i][j] = matrix[s--][i];
            }
        }

        // Copy back to matrix
        matrix = arr;
    }
};
