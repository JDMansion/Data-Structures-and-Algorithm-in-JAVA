class Solution{
        
    static int search(int arr[], int N, int X)
    {
        boolean flag = false;
        for(int i=0; i<N; i++) {
            if(arr[i] == X) {
                flag = true;
                return i;
            }
        }
        return -1;
    } 
}
