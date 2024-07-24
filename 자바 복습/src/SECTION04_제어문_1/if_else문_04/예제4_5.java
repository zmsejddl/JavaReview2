package SECTION04_제어문_1.if_else문_04;

public class 예제4_5 {
	public static void main(String[] args) {
		// if-else 문 활용 1

		int a = 4;
		int b = 10;
		int max = 0;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		System.out.println(a + "와(과) " + b + " 중에 큰 수는 " + max + "입니다.");
	}
}
