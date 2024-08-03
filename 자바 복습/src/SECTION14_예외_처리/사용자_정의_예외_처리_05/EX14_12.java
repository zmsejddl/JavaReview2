package SECTION14_예외_처리.사용자_정의_예외_처리_05;

import java.util.Scanner;

//메인 소스

public class EX14_12 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner scan = new Scanner(System.in);
		try {
			// 나이 입력
			System.out.print("당신의 나이를 입력하세요 >>");
			int age = scan.nextInt();

			if (age < 0) {
				// 1살 미만인 경우 입력 실패
				throw new EX14_11("입력이 잘못되었습니다.");
			}

			if (age > 19) {
				System.out.println("성인입니다.");
			} else if (age > 13) {
				System.out.println("청소년입니다.");
			} else if (age > 6) {
				System.out.println("어린이입니다.");
			} else {
				System.out.println("아동입니다.");
			}
		} catch (EX14_11 e) {
			System.out.println(e.getMessage());
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

	/*
	 * 해설
	 * 18: 개발자가 만든 EX14_11을 임의로 예외 발생시킵니다.
	 * 30~32: 발생한 예외를 처리합니다.
	 */
}
