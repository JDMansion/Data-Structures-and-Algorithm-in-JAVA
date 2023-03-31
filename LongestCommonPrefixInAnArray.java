class Solution{
    String longestCommonPrefix(String arr[], int n){
         int i=0;
        ArrayList<String> deb=new ArrayList<>();
        for( i=0;i<n;i++)
        {
            deb.add(arr[i]);
        }
        String ans="-1";
        int k=0;
        int size=arr[0].length();
         for( i=0;i<n;i++)
        {
            
            if(arr[i].length()<size)
            {size=arr[i].length();
            k=i;
            }
        }
       
       outer: for( i=0;i<size;i++)
        {
           inner: for(int j=0;j<n;j++)
            {
           if( deb.get(k).substring(0,i+1).equals(deb.get(j).substring(0,i+1)))
            {
               continue;
            }
            else
            {  
               
              break outer;
            }
           }
           
        }
       
          ans=deb.get(k).substring(0,i);
          if (ans.equals(""))
          {
              ans="-1";
          }
        return ans;
    }
}
