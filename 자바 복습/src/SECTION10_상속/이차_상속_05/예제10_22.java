package SECTION10_상속.이차_상속_05;

//N차 상속

public class 예제10_22 extends 예제10_21 {
	int peopleNum; // 승객 수

	예제10_22(int peopleNum) {
		this.peopleNum = peopleNum; // 승객 수 초기화
	}

	void takePerson() {
		System.out.println("승객이 버스에 탔습니다.");
		peopleNum++;
		System.out.println("지금까지 탑승한 승객은 " + peopleNum + "명입니다.");
	}
}
