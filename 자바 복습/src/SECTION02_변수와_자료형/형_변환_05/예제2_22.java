package SECTION02_변수와_자료형.형_변환_05;

public class 예제2_22 {
	public static void main(String[] args) {
		//정수형 <-> 정수형 형 변환하기
		
		int i1 = 10;
		byte b1 = (byte)i1;
		System.out.println(b1);
		
		int i2 = 128;
		byte b2 = (byte)i2;
		System.out.println(b2);
	}
}
