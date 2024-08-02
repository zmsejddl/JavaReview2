package SECTION12_추상_클래스와_인터페이스.인터페이스_구현_02;

//상수 추가

public interface EX12_10 {

	public static final int MAX_BATTERY_CAPACITY = 100;

	abstract void powerOn(); // <- 공통 구현부가 사라짐

	abstract void powerOff(); // <- 공통 구현부가 사라짐

	abstract boolean isOn(); // 새로운 메서드 추가

	abstract void watchUtube(); // 새로운 메서드 추가

	abstract void charge(); // 새로운 메서드 추가
}
