package SECTION06_배열.배열의_구조_02;

public class 예제6_2 {
	public static void main(String[] args) {
		// 배열에 값 저장하기

		// 4개의 공간을 가진 배열을 선언
		int[] arr = new int[4];

		// 배열에 값을 삽입
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		// 배열에 값을 출력
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		
		/*
		 * 해설
		 * 08: 4개의 공간을 가지는 정수 타입 배열을 선언합니다.
		 * 11~14: 배열에 데이터를 입력합니다.
		 */
	}
}
