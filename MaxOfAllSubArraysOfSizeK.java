class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max;
    
        for(int i=0; i<n-k+1; i++) {
            max = arr[i];
            for(int j=1; j<k; j++) {
                if(arr[i+j] > max) {
                    max = arr[i+j];
                }
            }
            list.add(max);
        }
        return list;
    }
}
