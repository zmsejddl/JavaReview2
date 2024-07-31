package SECTION10_상속.final클래스와_final메서드_06;

//final 메서드
public class 예제10_25 { // 클래스 선언
	String title;
	String author;

	예제10_25(String title, String author) {
		this.title = title;
		this.author = author;
	}

	final void info_title() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}

	void info_author() {
		System.out.println("책의 저자는 " + author + "입니다.");
	}
}
