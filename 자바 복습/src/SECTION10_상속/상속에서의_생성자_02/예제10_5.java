package SECTION10_상속.상속에서의_생성자_02;

//상속에서 생성자

public class 예제10_5 extends 예제10_4 { // 자식 클래스 선언
	int memberID;

	public 예제10_5(String name, int age, int memberID) {
		super(name, age); // super 메서드를 통해서 부모 생성자에 매개변수 전달
							// 부모 객체 생성!
		this.memberID = memberID;
	}

	void enter() {
		System.out.println("회원번호: " + memberID 
							+ " (" + name + ", " + age + "세) 님 입장하셨습니다.");
		// name, age는 부모 클래스에게 상속받은 필드입니다.
	}
}
