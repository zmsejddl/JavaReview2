package SECTION15_기본_API_클래스.java.lang_패키지_02;

//substring 메서드

public class EX15_11 {
	public static void main(String[] args) {
		// 문자열 선언
		String str = "1234-5678";
		// 4번째 위치부터 문장끝까지 가져온다.
		String subStr = str.substring(5);

		System.out.println("4번째 위치부터 추출: " + subStr);

		// 범위 내에서 문자를 추출한다
		String rangeStr = str.substring(0, 4);
		System.out.println("범위 내에서 추출: " + rangeStr);
	}
}
