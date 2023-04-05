class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int size = N-K+1;
        long[] win = new long[size];
        for(int i=0; i<size; i++) {
            win[i] = 0;
        }
        int i=0;
        int curr =0;
        Queue<Integer> s = new LinkedList<>();
        while(i<N) {
            if(A[i] < 0) {
                s.add(i);
            } 
            
            while(s.size() > 0 && s.peek()<(i-K+1)) {
                s.remove();
            }
            
            if(i>=K) 
                curr++;
                
            if(win[curr] == 0 && s.size() != 0) {
                    win[curr] = A[s.peek()];
            }
            i++;
        }
        return win;   
    }
}
