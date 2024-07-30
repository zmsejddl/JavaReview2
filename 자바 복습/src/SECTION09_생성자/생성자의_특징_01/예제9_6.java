package SECTION09_생성자.생성자의_특징_01;

//매개변수 2개로 객체 생성하기

public class 예제9_6 { // 클래스 선언
	public static void main(String[] args) {
		예제9_5 p1 = new 예제9_5("김자바", 20);
		예제9_5 p2 = new 예제9_5("이코딩", 40);

		p1.introduce();
		p2.introduce();
	}
}
