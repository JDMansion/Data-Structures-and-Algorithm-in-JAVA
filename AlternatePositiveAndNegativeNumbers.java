class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(arr[i] >= 0) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        
        int i=0; 
        int j=0;
        while(i<pos.size() && j<neg.size()) {
            ans.add(pos.get(i));
            i++;
            ans.add(neg.get(j));
            j++;
        }
        
        for(int k=i; k<pos.size(); k++) {
            ans.add(pos.get(k));
        }
        for(int k=j; k<neg.size(); k++) {
            ans.add(neg.get(k));
        }
        
        int k=0;
        for(Integer in: ans) {
            arr[k] = in;
            k++;
        }
    }
}
