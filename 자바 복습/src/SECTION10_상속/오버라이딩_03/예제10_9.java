package SECTION10_상속.오버라이딩_03;

//메서드 오버라이딩

public class 예제10_9 { // 클래스 선언
	public static void main(String[] args) {
		예제10_8 s = new 예제10_8();
		s.powerOn(); // 예제10_8 클래스에서 오버라이딩된 메서드가 호출
		s.powerOff(); // 예제10_7 클래스의 메서드가 호출

		예제10_7 c = new 예제10_7();
		c.powerOn(); // 예제 10_7 크래스의 메서드가 호출
		c.powerOff(); // 예제 10_7 크래스의 메서드가 호출
	}
}
