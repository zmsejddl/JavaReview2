package SECTION02_변수와_자료형.형_변환_05;

public class 예제2_24 {
	public static void main(String[] args) {
		//실수형 <-> 정수형 형 변환하기
		
		//실수형 -> 정수형
		double pie = 3.14;
		int pieInt = (int)pie;
		System.out.println(pieInt);
		
		//정수형 -> 실수형 (범위 내)
		int num = 100;
		double numD = (double)num;
		float numF = (float)100;
		System.out.println(numD);
		System.out.println(numF);
		
		//정수형 -> 실수형 (범위 밖)
		int i = 99999999;
		float f = (float) i;
		System.out.println(f);
	}
}
