package timeComplexity;

public class PermMissingElem {

	public static void main(String[] args) {
		// int[] A = { 2, 3, 1, 5 };
		int[] A = { 1, 3 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		long N = A.length + 1;
		long sum = N * (N + 1) / 2;

		for (long i : A) {
			sum -= i;
		}

//		System.out.println(sum);

		return (int) sum;

	}
}
