package SECTION12_추상_클래스와_인터페이스.인터페이스_사용_03;

import SECTION12_추상_클래스와_인터페이스.인터페이스_구현_02.EX12_10;

//다형성

class EX12_13 {
	EX12_10 p;

	public EX12_13(EX12_10 p) { // 타입 변환을 통해 다형성을 구현할 수 있음
		this.p = p;
	}

	void buyNewPhone(EX12_10 p) {
		this.p = p;
		System.out.println("==============");
		System.out.println("새 폰을 샀습니다!");
	}

	void turnOnPhone() {
		p.powerOn();
	}

	void turnOffPhone() {
		p.powerOff();
	}

	void watchUtube() {
		if (p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("폰이 꺼져 있기 때문에 U튜브를 볼 수 없습니다.");
		}
	}

	void chargePhone() {
		p.charge();
	}
}
