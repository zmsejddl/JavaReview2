package SECTION09_생성자.생성자_오버로딩_02;

//매개변수 부족 컴파일 오류

public class 예제9_8 { // 클래스 선언
	public static void main(String[] args) {
		예제9_7 p1 = new 예제9_7("갤럭시", 1, "흰색");
		// 예제9_7 p2 = new 예제9_7("아이폰", 2); // 컴파일 오류
		
		/*
		 * TIP
		 * 자바에서 오버로딩은 생성자에 국한되지 않고, 메서드에도 적용됩니다.
		 */
	}
}
