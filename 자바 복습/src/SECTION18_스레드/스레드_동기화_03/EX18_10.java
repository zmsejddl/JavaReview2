package SECTION18_스레드.스레드_동기화_03;

//클래스 블록 동기화 처리
public class EX18_10 {
	private int money;

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}
}
