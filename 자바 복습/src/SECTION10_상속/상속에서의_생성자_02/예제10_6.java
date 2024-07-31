package SECTION10_상속.상속에서의_생성자_02;

//상속에서 생성자

public class 예제10_6 { // 클래스 선언
	public static void main(String[] args) {
		예제10_5 c1 = new 예제10_5("박자바", 25, 11111);
		c1.enter();

		예제10_5 c2 = new 예제10_5("송코딩", 20, 22222);
		c2.enter();
	}
}
