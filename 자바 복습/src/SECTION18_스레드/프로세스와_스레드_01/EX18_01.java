package SECTION18_스레드.프로세스와_스레드_01;

//스레드 기본 예제

public class EX18_01 {

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름: " + threadName);
	}
	/*
	 * 해설
	 * 08: 현재 실행 중인 스레드의 이름을 반환합니다.
	 * 09: 스레드 이름을 출력합니다.
	 */
}
