package SECTION08_메서드.메서드_01;

//2개 이상의 메서드 선언하기 1

public class 예제8_4 {
	String name; // 조거의 이름

	void run() {
		System.out.println("run run run!");
	}

	void sayName() {
		// 필드를 이용해 아래 문장 출력
		System.out.println("제 이름은 " + name + "입니다.");
	}
}
