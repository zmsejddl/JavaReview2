package SECTION07_클래스.정적_멤버와_static_04;

//인스턴스

public class 예제7_15 { // 클래스 선언
	public static void main(String[] args) {
		예제7_14 stu1 = new 예제7_14();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " + 예제7_14.schoolName + "입니다.");
		예제7_14.goToSchool();

		예제7_14 stu2 = new 예제7_14();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + 예제7_14.schoolName + "입니다.");
		예제7_14.goToSchool();
	}
}
