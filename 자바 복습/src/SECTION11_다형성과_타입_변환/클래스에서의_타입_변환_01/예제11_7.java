package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//강제 형 변환 2

public class 예제11_7 extends 예제11_6 {
	예제11_7(String riderName) {
		super(riderName);
	}

	@Override
	void info() {
		super.info();
	}

	void addWheel() {
		if (wheel == 2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다.");
		} else {
			System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
		}
	}
}
