package SECTION06_배열.Arrays_03;

import java.util.Arrays;

public class 예제6_8 {
	public static void main(String[] args) {
		// Arrays.sort()를 이용한 배열의 오름차순

		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 };

		System.out.println("정렬 전 배열: " + Arrays.toString(arr));
		// 배열의 오름차순 정렬
		Arrays.sort(arr);
		System.out.println("오름차순 정렬: " + Arrays.toString(arr));
		
		/*
		 * 해설
		 * 09: 무작위로 숫자를 나열한 배열을 선언합니다.
		 * 13: Arrays.sort()를 이용해 오름차순으로 정렬합니다.
		 */
	}
}
