package SECTION08_메서드.매개변수와_return_02;

//리턴한 값을 변수에 저장하는 메서드 호출

public class 예제8_17 {
	public static void main(String[] args) {
		int[] studentA = { 97, 53 };
		int[] studentB = { 95, 66 };

		예제8_16 mid = new 예제8_16(); // 예제8_16 객체 생성
		int sumA = mid.score(studentA); // 메서드를 호출한 결과값을 sumA에 저장
		int sumB = mid.score(studentB); // 메서드를 호출한 결과값을 sumB에 저장

		if (sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if (sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else { // sumA == sumB
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}
}
