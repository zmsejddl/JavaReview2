package SECTION11_다형성과_타입_변환.클래스에서의_타입_변환_01;

//강제 형 변환 3

public class 예제11_8 {
	public static void main(String[] args) {
		예제11_6 b = new 예제11_6("윤기");
		b.info();
		b.ride();
		// b.addWheel(); <- 부모 타입으로는 호출 불가

		System.out.println();

		예제11_7 fwb = (예제11_7) b; // 강제 타입 변환
		fwb.addWheel(); // 자식 메서드 사용 가능
		fwb.info();
		fwb.ride();
	}
}
