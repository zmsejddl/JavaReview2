package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//클래스의 자동 타입 변환 3

public class 예제11_3 {
	String color;
	int months;

	public 예제11_3(String color, int months) {
		this.color = color;
		this.months = months;
	}

	void info() {
		System.out.println(color + " 달력은 " + months + "월까지 있습니다.");
	}

	void hanging() {
		System.out.println(color + " 달력을 벽에 걸 수 있습니다.");
	}
}
