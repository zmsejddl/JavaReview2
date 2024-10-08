package SECTION15_기본_API_클래스.java.lang_패키지_02;

//StringBuilder 클래스

public class EX15_12 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		// 기존 문자열 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열 길이: " + str.length());
		// 문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열 길이: " + str.length());

		// 원하는 위치에 문자열 삽입
		str.insert(0, "Hello");
		System.out.println(str);
		System.out.println("문자열 길이: " + str.length());
		// 문자를 반대로 출력
		str.reverse();
		System.out.println(str);
	}
	/*
	 * 해설
	 * 07: StringBuilder를 생성하고 생성자를 통해 매개변수를 받을 수 있습니다.
	 * 09: 기존 문자열 뒤에 새로운 문자열을 추가합니다.
	 * 13: 원하는 길이만큼 문자열을 삭제합니다.
	 * 18: 원하는 위치에 문자열을 삽입합니다.
	 * 22: 문자열을 반대로 출력합니다.
	 */
}
