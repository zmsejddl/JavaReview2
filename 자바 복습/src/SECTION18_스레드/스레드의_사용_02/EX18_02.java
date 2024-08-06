package SECTION18_스레드.스레드의_사용_02;

//스레드 구현

class MyThread extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + (i + 1);
		}

		System.out.println("sum = " + sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름: " + threadName);
	}
}

public class EX18_02 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
	}
	/*
	 * 해설
	 * 05: Thread 클래스를 상속하여 스레드를 구현합니다.
	 * 07~11: 스레드 동작을 위해 run() 메서드를 구현합니다.
	 * 14: 스레드에 별도의 이름을 지정해 주지 않으면 시스템에서 정의합니다.
	 * 22: 스레드를 시작합니다.
	 */
}