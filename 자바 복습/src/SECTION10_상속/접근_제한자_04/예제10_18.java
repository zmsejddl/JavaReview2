package SECTION10_상속.접근_제한자_04;

//접근 제한자 protected

public class 예제10_18 { // 클래스 선언
	void accessTest() {
		예제10_16 p2 = new 예제10_16();
		// p2.accessProtected(); 에러:
		// The method accessProtected() from the type 예제10_16 is not visible
	}
}
