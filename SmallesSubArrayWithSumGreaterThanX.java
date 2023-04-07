class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        
        int res = Integer.MAX_VALUE;
        int i=0, j=0;
        int sum = 0;
        
        while(j < n) {
            while(sum <= x && j < n) {
                sum = sum + a[j++];
            }
            
            while(sum > x && i <= j) {
                res = Math.min(j-i, res);
                sum = sum - a[i++];
            }
        }
        return res;
    }
}
