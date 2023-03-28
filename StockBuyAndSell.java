class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n-1; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            if(A[i+1] > A[i]) {
                list1.add(i);
                list1.add(i+1);
                list.add(list1);
            }
        }
        return list;
    }
}
