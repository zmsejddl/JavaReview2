package SECTION08_메서드.getter와_setter메서드_03;

//필드에 대한 접근 강화하기

public class 예제8_22 {
	private int age; // 예제8_22 클래스에서만 접근 가능한 age 필드 선언

	void setAge(int num) {
		if (num <= 0) { // 만약, age에 넣으려는 값이 0보다 작거나 같다면,
			// 값이 잘못되었음을 출력하여 알려줌
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.");
			return; // 메서드 종료
		} else {
			age = num; // age 필드에 num 값 저장
		}
	}

	int getAge() {
		return age;
	}
}
