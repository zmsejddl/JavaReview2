package SECTION10_상속.final클래스와_final메서드_06;

//final 메서드

public class 예제10_27 { // 클래스 선언
	public static void main(String[] args) {
		예제10_26 comicBook = new 예제10_26("주머니 괴물", "미상", true);
		comicBook.info_title();
		comicBook.info_author();
		comicBook.info_color();
	}
}
