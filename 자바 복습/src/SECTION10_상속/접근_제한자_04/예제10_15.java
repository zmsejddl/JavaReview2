package SECTION10_상속.접근_제한자_04;

//접근 제한자 default

public class 예제10_15 { // 클래스 선언
	public static void main(String[] args) {
		예제10_13 c = new 예제10_13();
		// c.variableC = 10; <- 필드가 public이더라도 객체를 생성하지 못하기 때문에
		// 사용할 수 없습니다.
	}
}
