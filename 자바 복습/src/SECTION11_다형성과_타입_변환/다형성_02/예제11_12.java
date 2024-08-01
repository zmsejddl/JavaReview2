package SECTION11_다형성과_타입_변환.다형성_02;

//컴퓨터 객체를 만들어줄 클래스

public class 예제11_12 {
	public static void main(String[] args) {
		예제11_11 cr = new 예제11_11();
		cr.computer1 = new 예제11_10(); // 예제11_10 computer1
		cr.computer2 = new 예제11_10(); // 예제11_10 computer2

		cr.allPowerOn();
		cr.allPowerOff();

		System.out.println();
	}
}
