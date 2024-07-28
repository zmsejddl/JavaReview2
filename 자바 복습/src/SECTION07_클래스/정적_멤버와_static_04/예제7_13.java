package SECTION07_클래스.정적_멤버와_static_04;

//정적 멤버

public class 예제7_13 { // 클래스 선언
	public static void main(String[] args) {
		System.out.println(예제7_12.schoolName); // 정적 필드 호출
		예제7_12.goToSchool(); // 정적 메서드 호출
	}
}
