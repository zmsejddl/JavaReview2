package SECTION04_제어문_1.switch문_06;

import java.util.Scanner;

public class 예제4_12 {
	public static void main(String[] args) {
		// switch 문 3 <break 활용>

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요. (1~5)");

		int num = sc.nextInt();
		switch (num) {
		case 5:
			System.out.println("5을 입력하였습니다.");
			break;
		case 4:
			System.out.println("4을 입력하였습니다.");
			break;
		case 3:
			System.out.println("3을 입력하였습니다.");
			break;
		case 2:
			System.out.println("2을 입력하였습니다.");
			break;
		case 1:
			System.out.println("1을 입력하였습니다.");
			break;
		default:
			System.out.println("1~5까지의 숫자를 입력하세요.");
		}
		
		/*
		 * 해설
		 * 14~28: num 변수의 값과 일치하는 case의 값을 찾아 문장을 실행합니다.
		 * 29~30: num 변수의 값과 일치하는 case의 값이 없으면 default 문장을 실행합니다.  
		 */
	}
}
