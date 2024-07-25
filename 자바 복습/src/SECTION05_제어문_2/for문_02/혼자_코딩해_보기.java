package SECTION05_제어문_2.for문_02;

public class 혼자_코딩해_보기 {
	public static void main(String[] args) {
		// 1부터 10까지의 합을 출력하는 프로그램을 다시 작성해 볼까요?
		// 단, 앞의 예제와 다르게 조건을 10부터 1까지 감소하면서 반복하여 더하는 구조의 프로그램을 구현해 보세요.
		
		int sum = 0;
		
		for(int i = 10; i >= 1; i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}
