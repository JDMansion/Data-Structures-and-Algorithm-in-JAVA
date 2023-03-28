class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 0);
            }
            map.put(arr[i], map.get(arr[i])+1);
        }
        
        int twice_count = 0;
        
        for(int i=0; i<n; i++) {
            if(map.get(k - arr[i]) != null) {
                twice_count += map.get(k - arr[i]);
            }
            if(k - arr[i] == arr[i]) {
                twice_count--;
            }
        }
        return twice_count/2;
    }
}
