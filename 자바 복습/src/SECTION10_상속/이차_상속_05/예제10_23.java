package SECTION10_상속.이차_상속_05;

//N차 상속

public class 예제10_23 extends 예제10_22 {
	예제10_23(int peopleNum) {
		super(peopleNum); // 예제10_22 클래스의 생성자 호출
	}

	@Override
	void takePerson() { // 예제10_22 클래스의 takePerson() 오버라이딩
		super.takePerson(); // 예제10_22 클래스의 takePerson() 메서드 호출
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
	}

	@Override
	void ride() { // 예제10_21 클래스의 ride() 오버라이딩
		System.out.println("시속 50km/h로 천천히 달립니다.");
	}
}
