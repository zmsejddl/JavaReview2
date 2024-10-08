package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//클래스의 자동 타입 변환 1

class Parent {
	
}

class Child extends Parent {
	
}

public class 예제11_1 {
	public static void main(String[] args) {
		Parent p1 = new Parent(); // p1 객체 생성
		Child c1 = new Child(); // c1 객체 생성

		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1; // 자동 타입 변환
		// Child c2 = p1; <-- 자동 타입 변환 x

		if (p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
	}
	
	/*
	 * 해설
	 * 20: p1을 Child 타입으로 변환을 시도하면 오류가 발생합니다.
	 * 22~24: p3와 c1이 참조하는 객체가 같은지 확인했을 때, true가 반환되어 if 문 블록 내 코드가 실행되었습니다.
	 */
	
	/*
	 * TIP
	 * 변수 A == 변수 B
	 * A와 B가 참조하고 있는 객체가 같으면 true를 반환
	 * A와 B가 참조하고 있는 객체가 다르면 false를 반환
	 */
}
