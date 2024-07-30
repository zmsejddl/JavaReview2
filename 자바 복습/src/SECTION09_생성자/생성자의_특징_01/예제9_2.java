package SECTION09_생성자.생성자의_특징_01;

//생성자
public class 예제9_2 { // 클래스 선언
	public static void main(String[] args) {
		예제9_1 chip = new 예제9_1(); // 객체 생성 및 초기화
		chip.price = 2000; // 객체 필드 설정
		chip.info(); // 객체 메서드 호출
	}
}
