// Last updated: 21/07/2026, 23:15:47
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;

        int[] arr = new int[size];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while (i < m) {
            arr[k++] = nums1[i++];
        }

        while (j < n) {
            arr[k++] = nums2[j++];
        }

        int temp = arr.length;
        double median;

        if (temp % 2 == 0) {
            int mid = temp / 2;
            median = (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            int mid = temp / 2;
            median = arr[mid];
        }

        return median;
    }
}