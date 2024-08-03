package SECTION14_예외_처리.예외_클래스_02;

//ArrayIndexOutOfBoundsException 예외
public class EX14_3 {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 7, 9, 10 };
		System.out.println(arr[6]);
	}
}
