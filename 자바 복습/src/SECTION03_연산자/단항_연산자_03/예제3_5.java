package SECTION03_연산자.단항_연산자_03;

public class 예제3_5 {
	public static void main(String[] args) {
		// 증감 연산자 3

		int num = 30;
		System.out.println(++num); // num(=30)에서 +1이 더해져 31 출력
		System.out.println(num); // 31 출력

		System.out.println(num++); // num(=31)이 먼저 출력된 후 32로 증가
		System.out.println(num); // 32 출력
	}
}
