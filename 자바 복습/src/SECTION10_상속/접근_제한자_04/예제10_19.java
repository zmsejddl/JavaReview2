package SECTION10_상속.접근_제한자_04;

//접근 제한자 private

public class 예제10_19 { // 클래스 선언
	public int a;

	private 예제10_19(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("PublicA클래스의 printA() 메서드입니다.");
	}
}
