package SECTION14_예외_처리.예외_던지기_04;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 던지기

public class EX14_9 {
	// 성격 유형 검사를 위한 메서드
	public static void checkYourSelf(Scanner scan) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.print("선택 >> ");
		int check = scan.nextInt();
		// 성격 체크 후 출력
		if (check == 1) {
			System.out.println("당신은 ENFP");
		} else {
			System.out.println("당신은 ISFP");
		}
	}

	public static void main(String[] args) {
		// 스캐너 선언
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("=========성격 유형 검사를 시작합니다.=========");
			// 메서드 호출
			EX14_9.checkYourSelf(scan);

		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		} finally {
			if (scan != null) {
				scan.close();
			}
			System.out.println("프로그램 종료");
		}
	}
	
	/*
	 * 해설
	 * 10: 예외 발생 시 호출한 대상으로 떠넘깁니다.
	 * 13: Scanner로 숫자를 입력합니다.
	 * 15~19: 키보드 입력을 처리합니다.
	 * 28: 메서드를 호출합니다.
	 * 30~32: 예외 처리를 합니다.
	 */
}
