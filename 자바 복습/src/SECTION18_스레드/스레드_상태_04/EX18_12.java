package SECTION18_스레드.스레드_상태_04;

//스레드 sleep

class TimeThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("스레드 출력: " + (i + 1));

			try {
				//1초간 일시 정지
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("sleep Error");
			}
		}
	}
}

public class EX18_12 {
	public static void main(String[] args) {
		TimeThread th = new TimeThread();
		th.start();
	}
	/*
	 * 해설
	 * 05: 스레드 객체를 선언합니다.
	 * 08: 스레드가 동작할 시간을 주기 위해 1000까지 반복합니다.
	 * 11~16: Thread.sleep은 CheckedException인 InterruptedException이 걸려 있어서 예외 처리를 해야 합니다.
	 * 13: 스레드를 1초간 대기 시킵니다.
	 */
}
