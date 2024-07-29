package SECTION08_메서드.매개변수와_return_02;

//매개변수가 2개 이상인 메서드 호출

public class 예제8_9 {
	public static void main(String[] args) {
		예제8_8 calc = new 예제8_8(); // 객체 생성
		calc.sun(5, 3); // calc 인스턴스 sum 메서드 호출
		calc.sun(10, 7); // calc 인스턴스 sum 메서드 호출
	}
}
