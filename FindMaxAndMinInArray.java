/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        
        
        
        for(int i=0; i<n; i++) {
            if(a[i] <= min) {
                min = a[i];
            }
            if(a[i] >= max) {
                max = a[i];
            }
        }
        return new pair(min, max);
    }
}
