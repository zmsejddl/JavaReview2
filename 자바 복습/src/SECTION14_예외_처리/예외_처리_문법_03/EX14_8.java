package SECTION14_예외_처리.예외_처리_문법_03;

import java.util.InputMismatchException;
import java.util.Scanner;

//finally 문법

public class EX14_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("점수를 입력하세요 >>");
			int score = scan.nextInt();
			if (score >= 60) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("아쉽네요. 불합격입니다.");
			}

		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 올바르지 않습니다.");

		} finally {
			System.out.println("프로그램 종료");
			scan.close();
		}
	}
	
	/*
	 * 해설
	 * 14: Scanner로 숫자를 입력합니다.
	 * 21~22: 숫자 외 입력 시 예외 처리합니다.
	 * 24~27: 예외 유무와 상관없이 실행되며 프로그램을 종료합니다.
	 */
}
