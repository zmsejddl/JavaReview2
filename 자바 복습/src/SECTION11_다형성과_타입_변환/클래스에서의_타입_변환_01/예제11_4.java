package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//클래스의 자동 타입 변환 3

public class 예제11_4 extends 예제11_3 {

	예제11_4(String color, int months) {
		super(color, months);
	}

	@Override
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}

	void onTheDesk() {
		System.out.println(color + " 달력을 책상에 세울 수 있습니다.");
	}
}
