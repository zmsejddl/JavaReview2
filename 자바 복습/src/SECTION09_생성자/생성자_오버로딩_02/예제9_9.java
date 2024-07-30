package SECTION09_생성자.생성자_오버로딩_02;

//생성자 추가

public class 예제9_9 { // 클래스 선언
	String brand;
	int series;
	String color = "검정색"; // 필드 기본값 초기화

	public 예제9_9(String b, int s) { // 매개변수를 2개 받는 생성자
		brand = b;
		series = s;
	}

	public 예제9_9(String b, int s, String c) {	// 매개변수를 3개 받는 생성자
		brand = b;
		series = s;
		color = c;
	}

	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
