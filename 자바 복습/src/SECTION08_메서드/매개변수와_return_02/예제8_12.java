package SECTION08_메서드.매개변수와_return_02;

//매개변수를 배열로 받는 메서드 정의

public class 예제8_12 {
	void sum(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i]; // 매개변수로 받은 배열의 요소 값을 하나씩
								// result 값에 더함
		}

		System.out.println("숫자들의 합은 " + result + "입니다.");
	}
}
