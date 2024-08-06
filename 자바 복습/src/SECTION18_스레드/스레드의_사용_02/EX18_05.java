package SECTION18_스레드.스레드의_사용_02;

//멀티 스레드

public class EX18_05 {
	public static void main(String[] args) {

		Runnable blue = () -> {
			while (true) {
				System.out.println("청기 올려");
			}
		};

		Runnable white = () -> {
			while (true) {
				System.out.println("백기 올려");
			}
		};

		Thread blueFlag = new Thread(blue);
		Thread whiteFlag = new Thread(white);

		blueFlag.start();
		whiteFlag.start();
	}
	/*
	 * 해설
	 * 20~21: 스레드를 2개 생성합니다.
	 * 23~24: 2개의 스레드를 동시에 실행시킵니다.
	 */
}
