package SECTION09_생성자.생성자_오버로딩_02;

//생성자 추가

public class 예제9_10 { // 클래스 선언
	public static void main(String[] args) {
		예제9_9 p1 = new 예제9_9("갤럭시", 1, "흰색");
		예제9_9 p2 = new 예제9_9("아이폰", 2);

		p1.phoneInfo();
		p2.phoneInfo();
	}
}
