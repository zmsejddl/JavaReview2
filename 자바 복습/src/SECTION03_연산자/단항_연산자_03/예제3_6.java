package SECTION03_연산자.단항_연산자_03;

public class 예제3_6 {
	public static void main(String[] args) {
		// 증감 연산자 위치에 따른 겨로가

		int x = 1;

		System.out.println(x++); // x(=1)가 먼저 출력되고 난 후
		System.out.println(x); // x에 +1이 더해져 2가 됨
		System.out.println(++x); // x(=2)에 +1이 더해져 3이 된 x가 출력
	}
}
