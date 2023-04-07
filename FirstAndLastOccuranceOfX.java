class Solution
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> list = new ArrayList<Long>();
        
        int first = -1, last = -1;
        for(int i=0; i<n; i++) {
            if(arr[i] == x && last == -1) {
                first = i;
                last = i;
                continue;
            }
            
            if(arr[i] == x) {
                last = i;
            }
        }
        list.add((long)first);
        list.add((long)last);
        return list;
    }
}
