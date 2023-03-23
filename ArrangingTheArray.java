class Compute {
    
    public void Rearrange(long a[], long n)
    {
        ArrayList<Long> list1 = new ArrayList<>();
        // ArrayList<Long> list2 = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(a[i] < 0) {
                list1.add(a[i]);
            }
        }
        for(int i=0; i<n; i++) {
            if(a[i] >= 0) {
                list1.add(a[i]);
            }
        }
        
        int i=0;
        for(Long l : list1) {
            a[i] = l;
            i++;
        }
    }
}
