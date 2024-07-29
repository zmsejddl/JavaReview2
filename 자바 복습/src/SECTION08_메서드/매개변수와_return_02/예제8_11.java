package SECTION08_메서드.매개변수와_return_02;

//다른 자료형 2개를 매개변수로 받는 메서드 호출

public class 예제8_11 {
	public static void main(String[] args) {
		예제8_10 hong = new 예제8_10(); // 객체 생성
		hong.introduce("홍길동", 20); // hong 인스턴스 introduce 메서드 호출
		hong.hello();
	}
}
