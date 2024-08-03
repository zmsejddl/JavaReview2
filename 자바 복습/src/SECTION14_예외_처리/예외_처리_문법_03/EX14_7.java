package SECTION14_예외_처리.예외_처리_문법_03;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 예외 처리

public class EX14_7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			int[] cards = { 4, 5, 1, 2, 7, 8 };
			System.out.println("몇 번째 카드를 뽑으시겠습니까? >>");

			int cardIndex = scan.nextInt();
			System.out.println("뽑은 카드 번호는: " + cards[cardIndex]);

		} catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
		}

		System.out.println("프로그램 종료");
		scan.close();
	}
	
	/*
	 * 해설
	 * 22~24: 배열의 인덱스 선택이 잘못됐을 경우 예외를 처리합니다.
	 */
}
