package SECTION09_생성자.생성자_오버로딩_02;

//오버로딩

public class 예제9_11 { // 클래스 선언
	String title = "제목없음";
	int series = 1;
	int page = 100;

	public 예제9_11() { // <- 생성자 1

	}

	public 예제9_11(String t) { // <- 생성자 2
		title = t;
	}

	public 예제9_11(String t, int p) { // <- 생성자 3
		title = t;
		page = p;
	}

	public 예제9_11(int s, String t) { // <- 생성자 4
		series = s;
		title = t;
	}
}
