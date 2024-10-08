package SECTION15_기본_API_클래스.java.lang_패키지_02;

//문자 타입 변환

public class EX15_15 {
	public static void main(String[] args) {

		String intStr = "70";
		String doubleStr = "60.5";

		int myScore = Integer.parseInt(intStr);
		double cutLineScore = Double.parseDouble(doubleStr);

		if (myScore >= cutLineScore) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	/*
	 * 해설
	 * 11: parseInt 메서드를 통해 문자 타입의 정수를 기본 타입으로 변경합니다.
	 * 12: parseDouble 메서드를 통해 문자 타입의 실수를 기본 타입으로 변경합니다.
	 */
}
