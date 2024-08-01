package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//강제 형 변환 1

public class 예제11_6 {
	String riderName;
	int wheel = 2;

	예제11_6(String riderName) {
		this.riderName = riderName;
	}

	void info() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거입니다.");
	}

	void ride() {
		System.out.println("씽씽");
	}
}
