package SECTION06_배열.배열의_구조_02;

public class 혼자_코딩해_보기 {
	public static void main(String[] args) {

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 30) + 1;
		}

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 != 0) {
				sum += numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		System.out.println("배열의 홀수들의 합: " + sum);
	}
}
