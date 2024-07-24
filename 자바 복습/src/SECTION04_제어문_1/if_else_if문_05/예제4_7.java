package SECTION04_제어문_1.if_else_if문_05;

public class 예제4_7 {
	public static void main(String[] args) {
		// if-else if 문 1

		int favorite = 7;

		if (favorite < 5) { // 1번 조건문
			System.out.println("좋아하는 숫자가 5보다 작습니다."); // 1번 구문
		} else if (favorite > 5) { // 2번 조건문
			System.out.println("좋아하는 숫자는 5보다 큽니다."); // 2번 구문
		} else {
			System.out.println("좋아하는 숫자가 5입니다.");
		}
	}
}
