package SECTION18_스레드.스레드의_사용_02;

//Runnable을 상속하는 Thread

//Runnable을 상속
class whiteFlag implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("백기 올려");
		}
	}
}

//스레드 메인
public class EX18_03 {
	public static void main(String[] args) {
		Thread write = new Thread(new whiteFlag());
		write.start();
	}
	/*
	 * 해설
	 * 06: 인터페이스 Runnable을 상속합니다.
	 * 08: 인터페이스 메서드인 run()을 구현하고 무한 반복하면서 "백기 올려"를 출력합니다.
	 * 18: 인터페이스 Runnable로 상속하여 만든 스레드는 Thread 클래스를 선언할 때 객체를 생성자 파라미터로 전달해야 합니다.
	 */
}
