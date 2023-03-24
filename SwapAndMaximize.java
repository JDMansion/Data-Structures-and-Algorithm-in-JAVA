class Solution
{
    long maxSum(long arr[] ,int n) {
        
        if(n == 2) {
            return 2 * Math.abs(arr[0] - arr[1]);
        }
        
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        long sum = 0;
        boolean flag = true;
        
        while(i < j) {
            sum = sum + Math.abs(arr[i] - arr[(j)]);
            if(flag == true) {
                i++;
            }
            else {
                j--;
            }
            flag = !flag;
        }
        
        sum = sum +  Math.abs(arr[0] - arr[j]);
        
        return sum;
    }
}
