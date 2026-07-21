// Last updated: 21/07/2026, 23:15:11
class Solution {
public:
  string countAndSay(int n) {
    string result = "1";  // Base term for n = 1

    for (int i = 2; i <= n; i++) {
        string current = "";
        int count = 1;

        // Go through previous term: result
        for (int j = 1; j < result.length(); j++) {
            if (result[j] == result[j - 1]) {
                count++;  // Same digit as before → increment count
            } else {
                // Digit changed → say the count and the digit
                current += to_string(count) + result[j - 1];
                count = 1;  // Reset count for new digit
            }
        }

        // After loop: add the last group
        current += to_string(count) + result.back();

        // Update result for next iteration
        result = current;
    }

    return result;
}
};