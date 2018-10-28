package arrays;

import java.util.*;

public class OddOccurrencesInArray2 {

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		Set<Integer> set = new HashSet<>();
		for (int i : A) {
			if (set.contains(i)) {
				set.remove(i);
			} else {
				set.add(i);
			}
		}
		return set.iterator().next();

	}

}
