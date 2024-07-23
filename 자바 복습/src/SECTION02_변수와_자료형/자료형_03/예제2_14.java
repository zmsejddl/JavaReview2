package SECTION02_변수와_자료형.자료형_03;

public class 예제2_14 {
	public static void main(String[] args) {
		//실수형 2 <정밀도 확인하기>
		
		double pieDouble = 3.1415922653589793;
		float pieFloat = 3.1415922653589793f;
		
		System.out.println("double: " + pieDouble);
		System.out.println("float: " + pieFloat);
		
		/*
		 * TIP
		 * 반드시 float형이 필요한 경우가 아니라면 실수를 저장하는 변수로는 double형을 사용하는 것을 권장합니다.
		 */
	}
}
