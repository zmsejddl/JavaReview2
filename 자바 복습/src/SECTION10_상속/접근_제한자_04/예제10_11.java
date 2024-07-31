package SECTION10_상속.접근_제한자_04;

//접근 제한자 public

public class 예제10_11 { // 클래스 선언
	public int a;

	public 예제10_11(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드입니다.");
	}
}
