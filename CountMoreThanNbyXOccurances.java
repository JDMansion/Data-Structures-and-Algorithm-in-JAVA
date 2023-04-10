class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int x = n/k;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            }
            else {
                hm.put(i,1);
            }
        }
        int count = 0;
        
        for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
            if(e.getValue() > x) {
                count++;
            }
        }
        return count;
    }
}
