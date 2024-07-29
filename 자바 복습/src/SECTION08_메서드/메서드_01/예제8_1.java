package SECTION08_메서드.메서드_01;

//메서드 선언 및 호출

public class 예제8_1 {
	public static void main(String[] args) {
		printHello(); // main 메서드 안에서 printHello() 메서드 호출
	}

	static void printHello() {

		System.out.println("안녕하세요.");
		System.out.println("만나서 반갑습니다.");
	}
	
	/*
	 * 해설
	 * 05: 예제8_1 클래스 안에서 선언했습니다.
	 * 10: static: 정적 멤버로 선언합니다.
	 * void: 바환할 결과가 없을 때, void라고 명시합니다.
	 * printHello(): 해당 메서드를 호출하기 위해 메서드명을 사용합니다.
	 */
}
