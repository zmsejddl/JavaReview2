package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//클래스의 자동 타입 변환 3

public class 예제11_5 { // 클래스 선언
	public static void main(String[] args) {

		예제11_4 dc = new 예제11_4("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();

		System.out.println();

		예제11_3 c = new 예제11_3("검은색", 12);
		c.info();
		c.hanging(); // 오버라이드한 메서드를 호출합니다.
		// c.onTheDesk();
	}
}
