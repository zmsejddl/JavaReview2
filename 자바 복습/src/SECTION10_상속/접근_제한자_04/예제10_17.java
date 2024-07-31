package SECTION10_상속.접근_제한자_04;

//접근 제한자 protected

public class 예제10_17 extends 예제10_16 { // 클래스 선언
	void accessTest() {
		super.accessProtected(); // 이렇게 접근이 가능합니다.
		예제10_16 p1 = new 예제10_16();
		// p1.accessProtected(); <- 자식 클래스더라도, 객체로 접근하는 것은 불가능합니다.
		// 에러: The method accessProtected() from the type 예제10_16 is not visible
	}
}
