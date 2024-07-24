package SECTION04_제어문_1.if_else_if문_05;

import java.util.Scanner;

public class 예제4_9 {
	public static void main(String[] args) {
		// if-else if 문 3

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		if (age > 19) {
			System.out.println("성인입니다.");
		} else if (age > 13) {
			System.out.println("청소년입니다.");
		} else if (age > 6) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("유아입니다.");
		}

		/*
		 * 해설 
		 * 12: age에 저장된 값이 19보다 크면 13행의 문장이 실행되고 if 문을 벗어납니다. 
		 * 14: age에 저장된 값이 19 이하이고 13보다 크면 15행의 문장이 실행되고 if 문을 벗어납니다. 
		 * 16: age에 저장된 값이 13 이하이고 6보다 크면 17행의 문장이 실행되고 if 문을 벗어납니다. 
		 * 18: age에 저장된 값이 6 이하인 경우 19행의 문장이 실행되고 20행으로 이동합니다.
		 */
	}
}
