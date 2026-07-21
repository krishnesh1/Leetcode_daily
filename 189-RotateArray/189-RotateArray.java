// Last updated: 21/07/2026, 23:13:35
class Solution {
    public void rotate(int[] arr, int k) {
        
        int n = arr.length;
        int K = k % n;

        int [] temp = new int[K];
        for(int i = 0; i < K;i++){
            temp[i]=arr[n-K+i];
        }

        for(int i = n-K-1;i>=0;i--){
            arr[i+K] = arr[i];
        }

        for(int i = 0; i < K; i++){
            arr[i]=temp[i];
        }
    }
}