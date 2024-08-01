package SECTION11_다형성과_타입_변환.다형성_02;

//객체를 만들어줄 클래스

public class 예제11_11 {
	예제11_10 computer1;
	예제11_10 computer2;

	void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}

	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}
}
