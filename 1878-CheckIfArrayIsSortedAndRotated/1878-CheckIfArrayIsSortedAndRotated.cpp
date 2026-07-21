// Last updated: 21/07/2026, 23:11:14
class Solution {
public:
    bool check(vector<int>& nums) {
       int n = nums.size();
    int countBreaks = 0;

    for (int i = 0; i < n; i++) {
        // Check if the current element is greater than the next element.
        if (nums[i] > nums[(i + 1) % n]) {
            countBreaks++;
        }
        // If there is more than one "break" in order, it is not rotated sorted.
        if (countBreaks > 1) {
            return false;
        }
    }

    return true;
    }
};