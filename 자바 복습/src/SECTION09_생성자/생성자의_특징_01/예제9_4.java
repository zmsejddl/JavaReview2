package SECTION09_생성자.생성자의_특징_01;

//생성자 추가하고 사용하기

public class 예제9_4 { // 클래스 선언
	public static void main(String[] args) {
		예제9_3 chip = new 예제9_3(5000); // 객체 생성 및 필드 초기화
		// chip.price = 2000;
		chip.info(); // 객체 메서드 호출
	}
}
