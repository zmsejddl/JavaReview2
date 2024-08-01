package SECTION11_다형성과_타입_변환.오버로딩과_오버라아딩_04;

//오버로딩과 오버라이딩

class Parent {
	public void display() {
		System.out.println("부모 클래스의 display() 메서드입니다.");
	}
}

class Child extends Parent {
	// 오버라이딩된 display() 메서드
	public void display() {
		System.out.println("자식 클래스의 display() 메서드입니다.");
	}

	// 오버로딩된 display() 메서드
	public void display(String str) {
		System.out.println(str);
	}
}

public class Inheritance06 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		ch.display("오버로딩된 display() 메서드입니다.");
	}
}
