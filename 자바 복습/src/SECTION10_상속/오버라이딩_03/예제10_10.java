package SECTION10_상속.오버라이딩_03;

//super

public class 예제10_10 extends 예제10_7 { // 클래스 선언
	@Override
	void powerOn() {
		super.powerOn(); // 부모 클래스(예제10_7)의 powerOn() 메서드 호출
		System.out.println("아이 러브 삼송");
	}
}
