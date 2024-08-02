package SECTION12_추상_클래스와_인터페이스.인터페이스_사용_03;

//다형성

public class EX12_14 {
	public static void main(String[] args) {
		EX12_13 jimin = new EX12_13(new EX12_11());
		jimin.turnOnPhone();
		for (int i = 1; i < 6; i++) {
			jimin.watchUtube();

			if (i % 3 == 0) {
				jimin.chargePhone();
			}
		}

		jimin.buyNewPhone(new EX12_12());
		jimin.turnOnPhone();

		for (int i = 1; i < 5; i++) {
			jimin.watchUtube();

			if (i % 3 == 0) {
				jimin.chargePhone();
			}
		}
	}
}
