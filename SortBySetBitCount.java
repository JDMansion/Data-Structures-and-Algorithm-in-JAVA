class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        Arrays.sort(arr, new Comparator<Integer> () {
            public int compare(Integer a, Integer b) {
                return Integer.bitCount(b) - Integer.bitCount(a);
            }
        });
      
    }
}
