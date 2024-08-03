package SECTION13_내부_클래스.내부_클래스의_종류_02;

//지역 클래스 예제

public class EX13_3 {
	private int speed = 10;

	public void getUnit(String unitName) {

		class Unit {
			public void move() {
				System.out.println(unitName + "이 " + speed + " 속도로 이동합니다.");
			}
		}
		Unit unit = new Unit();
		unit.move();
	}

	public static void main(String[] args) {
		EX13_3 local = new EX13_3();
		local.getUnit("마린");
	}
	
	/*
	 * 해설
	 * 06: 인스턴스 변수를 선언합니다.
	 * 08: 유닛의 이름을 매개변수로 하는 메서드를 선언합니다.
	 * 10: 메서드 내부에 Unit 클래스를 생성합니다.
	 * 15~16: 지역 클래스를 선언하여 사용합니다.
	 */
}
