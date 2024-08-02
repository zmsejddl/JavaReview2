package SECTION12_추상_클래스와_인터페이스.인터페이스_사용_03;

//다중 인터페이스

public class EX12_18 {
	public static void main(String[] args) {
		EX12_17 bm = new EX12_17();

		bm.music();
		bm.sing();
		EX12_15 m = bm;
		EX12_16 s = bm;
	}
}
