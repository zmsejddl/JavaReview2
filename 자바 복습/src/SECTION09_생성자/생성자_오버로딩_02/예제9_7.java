package SECTION09_생성자.생성자_오버로딩_02;

//생성자 매개변수 부족

public class 예제9_7 { // 클래스 선언
	String brand;
	int series;
	String color = "검정색"; // 필드 기본값 초기화

	public 예제9_7(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}

	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
