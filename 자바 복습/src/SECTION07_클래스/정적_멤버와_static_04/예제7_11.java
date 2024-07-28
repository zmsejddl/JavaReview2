package SECTION07_클래스.정적_멤버와_static_04;

//인스턴스 멤버

public class 예제7_11 { // 클래스 선언
	public static void main(String[] args) {
		예제7_10 father = new 예제7_10();
		예제7_10 son = new 예제7_10();

		father.address = "인천";
		System.out.println(son.address);
	}
}
