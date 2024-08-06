package SECTION18_스레드.스레드_동기화_03;

//클래스 메서드 동기화 처리

public class EX18_08 {
	private int money;

	public int getMoney() {
		return money;
	}

	public synchronized void addMoney(int money) {
		this.money += money;
	}
	
	/*
	 * 해설
	 * 12: addMoney() 메서드를 동기화 합니다.
	 */
}
