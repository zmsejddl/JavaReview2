package SECTION04_제어문_1.switch문_06;

public class 예제4_11 {
	public static void main(String[] args) {
		// switch 문 2 <break 제외>

		int num = 7;

		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 7입니다.");
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
	}
}
