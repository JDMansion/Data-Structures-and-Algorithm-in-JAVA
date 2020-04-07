import java.util.*;
public class PrintIntersection {

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				int a = map.get(arr1[i]);
				map.put(arr1[i], ++a);
			}
			else
				map.put(arr1[i], 1);
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i]) != 0) {
				System.out.println(arr2[i]);
				int a = map.get(arr2[i]);
				map.put(arr2[i], --a);
			}
		}
	}

}
