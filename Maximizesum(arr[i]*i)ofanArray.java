class Solution{
    
    int Maximize(int arr[], int n)
    {
        int mod = 1000000007;
        Arrays.sort(arr);
        long total = 0;
        for(int i=0; i<n; i++) {
            total = (total + (long)arr[i]*i)%mod;
        }
        return (int)total;
    }   
}
