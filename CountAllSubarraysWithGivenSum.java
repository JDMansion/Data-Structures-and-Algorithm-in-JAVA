import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int n = arr.length;
        Map map = new HashMap();
        int preSum = 0, cnt = 0;
        
        map.put(0,1);

        for(int i=0; i<n; i++) {
            preSum += arr[i];

            int remove = preSum - s;
            
            cnt = cnt + (int)map.getOrDefault(remove, 0);
            
            map.put(preSum, (int)map.getOrDefault(preSum, 0) + 1);
        }    
        return cnt;
    }
}
