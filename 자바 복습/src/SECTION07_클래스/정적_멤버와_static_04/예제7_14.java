package SECTION07_클래스.정적_멤버와_static_04;

//인스턴스

public class 예제7_14 { // 클래스 선언
	static String schoolName = "코리아 고등학교"; // 정적 필드 선언
	String studentName; // 인스턴스 필드 선언

	static void goToSchool() { // 정적 메서드 선언
		System.out.println("오늘은 학교에 가는 날입니다.");
	}

	void hello() { // 인스턴스 메서드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}
