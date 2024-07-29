package SECTION08_메서드.매개변수와_return_02;

//매개변수를 배열로 받는 메서드 호출

public class 예제8_13 {
	public static void main(String[] args) {
		int nums[] = { 100, 200 }; // 배열 생성
		예제8_12 calc = new 예제8_12(); // Calc 객체 생성
		calc.sum(nums); // calc 인스턴스의 sum 메서드 호출
	}
}
