package arrays;

import java.util.*;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7 };
		solution(A);
	}

	public static int solution(int[] A) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int a : A) {
			if (map.get(a) != null) {
				int val = map.get(a);
				map.put(a, val + 1);
			} else {
				map.put(a, 1);
			}
		}

//		System.out.println(map);

		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
//				System.out.println(key);
				return key;
			}
		}

		return 0;
	}

}
