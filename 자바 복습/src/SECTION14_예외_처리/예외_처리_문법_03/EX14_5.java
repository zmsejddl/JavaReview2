package SECTION14_예외_처리.예외_처리_문법_03;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 처리 2

public class EX14_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("점수를 입력하세요: ");
			int score = scan.nextInt();

			if (score >= 65) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("합격입니다.");
			}

		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		}

		scan.close();
		System.out.println("프로그램 종료");
	}
	
	/*
	 * 해설
	 * 14: Scanner를 통해 정수 타입 값을 입력받아야 합니다. 정수 외의 값을 입력하면 예외가 발생합니다.
	 * 22: Scanner를 통한 키보드 입력이 잘못되면 InputMismatchException 예외가 발생합니다.
	 */
}
