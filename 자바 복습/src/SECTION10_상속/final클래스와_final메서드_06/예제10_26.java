package SECTION10_상속.final클래스와_final메서드_06;

//final 메서드

public class 예제10_26 extends 예제10_25 { // 예제10_25 클래스를 상속받는 자식 클래스 예제10_26
	boolean isColor;

	예제10_26(String title, String author, boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}

//	@Override
//	void info_title() {	//부모 크래스에서 final로 선언된 메서드를 오버라이딩 시도하면
//							Cannot override the final method from Parent
//							//이러한 에러가 발생합니다.
//		System.out.println("이 만화책의 제목은 " + title + "입니다.");
//	}

	@Override
	void info_author() {
		System.out.println("이 만화책의 저자는 " + author + "입니다.");
	}

	void info_color() {
		if (isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
}
