package SECTION09_생성자.생성자의_특징_01;

//생성자 추가하고 사용하기

public class 예제9_3 {
	int price;

	public 예제9_3(int p) {
		price = p;
	}

	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다.");
	}
}
