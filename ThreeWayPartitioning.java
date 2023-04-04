class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        
        while(mid <= high) {
            if(array[mid] < a) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            }
            else if(array[mid] > b) {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }else {
                mid++;
            }
        }
    }
}
