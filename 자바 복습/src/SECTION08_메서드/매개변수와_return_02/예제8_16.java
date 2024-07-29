package SECTION08_메서드.매개변수와_return_02;

//리턴한 값을 변수에 저장하는 메서드 정의

public class 예제8_16 {
	public int score(int[] scores) {
		int result = 0;
		for (int i = 0; i < scores.length; i++) {
			result += scores[i];
		}

		return result;
	}
}
