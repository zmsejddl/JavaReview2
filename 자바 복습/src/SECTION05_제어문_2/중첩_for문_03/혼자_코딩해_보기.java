package SECTION05_제어문_2.중첩_for문_03;

public class 혼자_코딩해_보기 {
	public static void main(String[] args) {
		//구구단 예제를 이용해 다음과 같이 출력되는 프로그램을 구현해 보세요.
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}

			System.out.println(); 
		}
	}
}
