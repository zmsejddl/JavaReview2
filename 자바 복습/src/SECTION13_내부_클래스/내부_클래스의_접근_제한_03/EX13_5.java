package SECTION13_내부_클래스.내부_클래스의_접근_제한_03;

//지역 클래스의 접근 제한

public class EX13_5 {
	private int speed = 10;

	public void getUnit(String unitName) {
		unitName = unitName + " 님";
		class Unit {
			public void move() {
				// unitName에서 오류 발생
				// System.out.println(unitName + "이" + speed + " 속도로 이동합니다.");
			}
		}
		Unit unit = new Unit();
		unit.move();
	}

	public static void main(String[] args) {
		EX13_5 local = new EX13_5();
		local.getUnit("마린");
	}
}
