class Solution
{
	public static int palinArray(int[] a, int n) {
               for(int i=0; i<n; i++) {
                   boolean ans = isPalin(a[i]);
                   if(ans == false) {
                       return 0;
                   }
               }
               return 1;
           }
           
           static boolean isPalin(int n) {
               String s = "" + n;
               int l = s.length();
               for(int i=0; i<l/2; i++) {
                   if(s.charAt(i) != s.charAt(l-1-i)) {
                       return false;
                   }
               }
               return true;
           }
}
