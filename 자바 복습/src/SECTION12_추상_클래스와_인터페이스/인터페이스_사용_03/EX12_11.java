package SECTION12_추상_클래스와_인터페이스.인터페이스_사용_03;

import SECTION12_추상_클래스와_인터페이스.인터페이스_구현_02.EX12_10;

//구현 클래스
public class EX12_11 implements EX12_10 {
	int batteryCapacity = 40;
	boolean isOn = false;

	@Override
	public void powerOn() { // 오버라이딩 하지 않으면 에러 발생
		if (batteryCapacity > 30) {
			System.out.println("@@@Power On!!@@@\n");
			isOn = true;
		} else {
			System.out.println("Low Battery...");
		}
	}

	@Override
	public void powerOff() { // 오버라이딩 하지 않으면 에러 발생
		System.out.println("@@@Power Off!!@@@\n");
		isOn = false;
	}

	@Override
	public boolean isOn() { // 오버라이딩 하지 않으면 에러 발생
		if (isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() { // 오버라이딩 하지 않으면 에러 발생
		if (batteryCapacity > 10) {
			System.out.println("--- watching Utube ---");
			batteryCapacity -= 10;
			System.out.println("battery is..." + batteryCapacity + "%\n");
		} else {
			System.out.println("Low battery...");
			powerOff();
		}
	}

	@Override
	public void charge() { // 오버라이딩 하지 않으면 에러 발생
		if (batteryCapacity < EX12_11.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- charging ---");
			batteryCapacity += 5;
			System.out.println("Charged..." + batteryCapacity + "%\n");
		} else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough... " + batteryCapacity + "%");
		}
	}

	/*
	 * 해설 06: 인터페이스의 구현 클래스를 명시하기 위해 implements EX12_10이라 선언합니다.
	 */
}
