package SECTION02_변수와_자료형.형_변환_05;

public class 예제2_27 {
	public static void main(String[] args) {
		//강제 형 변환 1
		
		//int형 -> byte형 강제 형 변환(값이 작을 경우)
		int i = 10;
		byte b = (byte)i;
		System.out.println("[int -> byte] i의 값: " + i + " b의 값: " + b);
		
		//int형 -> byte형 강제 형 변환(값이 큰 경우)
		int j = 1000;
		byte c = (byte)j;
		System.out.println("[int -> byte] j의 값: " + j + " c의 값: " + c);
	}
}
