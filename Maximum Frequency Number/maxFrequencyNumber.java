import java.util.HashMap;
import java.util.Scanner;

public class maxFrequencyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(maxFrequency(arr));
	}
	
	public static int maxFrequency(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int v = map.get(arr[i]);
				map.put(arr[i], v++);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		int k = 1;
		int ans = arr[0];
		for(int z : map.keySet()) {
			if(map.get(z) > k) {
				k = map.get(z);
				ans = z;
			}
		}
		return ans;
	}

}
