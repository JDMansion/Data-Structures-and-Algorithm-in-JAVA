class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long arr[]=new long[n];
           long left[]=new long[n];
              long right[]=new long[n];
     
          left[0]=1;
          
          right[n-1]=1;
         
      for(int i=1;i<n;i++){
         left[i]=left[i-1]*nums[i-1];
      }
      
      for(int j=n-2;j>=0;j--){
          right[j]=right[j+1]*nums[j+1];
      }
      for(int i=0;i<n;i++){
          arr[i]=left[i]*right[i];
      }
      return arr;
	} 
} 
