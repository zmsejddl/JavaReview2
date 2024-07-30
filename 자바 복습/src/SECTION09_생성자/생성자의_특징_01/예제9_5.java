package SECTION09_생성자.생성자의_특징_01;

//매개변수 2개로 객체 생성하기

public class 예제9_5 { // 클래스 선언
	String name;
	int age;

	public 예제9_5(String n, int a) {
		name = n;
		age = a;
	}

	void introduce() {
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");
	}
}
