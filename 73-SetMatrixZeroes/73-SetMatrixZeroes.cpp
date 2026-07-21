// Last updated: 21/07/2026, 23:14:44
class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();

        vector<int> rows; 
        vector<int> cols;

        // Step 1: find all zero positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.push_back(i);
                    cols.push_back(j);
                }
            }
        }

        // Step 2: zero out rows
        for (int r : rows) {
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
        }

        // Step 3: zero out cols
        for (int c : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
    }
};
