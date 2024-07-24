package SECTION04_제어문_1.switch문_06;

public class 예제4_10 {
	public static void main(String[] args) {
		// switch 문 1

		int num = 7;

		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
		
		/*
		 * TIP
		 * if-else if 문에서 가장 마지막 구문인 else를 생략할 수 있었던 것처럼,
		 * switch 문에서도 default: 구문을 생략할 수 있습니다.
		 */
	}
}
