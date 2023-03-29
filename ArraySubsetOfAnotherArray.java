class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        if(n < m) {
            return "No";
        }
            
        int count = 0, i = 0, j = 0;
        
        while(i<n && j<m) {
            if(a2[j] == a1[i]) {
                count++;
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        
        if(count == a2.length) 
            return "Yes";
        else
            return "No";
    }
}
