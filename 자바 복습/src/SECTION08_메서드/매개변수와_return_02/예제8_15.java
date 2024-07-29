package SECTION08_메서드.매개변수와_return_02;

//result를 반환하는 메서드 호출

public class 예제8_15 {
	public static void main(String[] args) {
		int[] nums = { 500, 200 }; // 배열 생성
		예제8_14 calc = new 예제8_14(); // 예제8_14 객체 생성
		// calc 인스턴스의 sum 메서드를 호출하여 return된 경과값을 출력
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");
	}
}
