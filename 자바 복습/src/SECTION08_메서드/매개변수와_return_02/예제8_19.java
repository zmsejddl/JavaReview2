package SECTION08_메서드.매개변수와_return_02;

//return으로 메서드 빠져나가기

public class 예제8_19 {
	public static void main(String[] args) {
		int money = 10000;

		예제8_18 bus = new 예제8_18(); // 예제8_18 객체 생성
		bus.take(money); // bus 인스턴스의 take 메서드 호출
	}
}
