package SECTION18_스레드.스레드_동기화_03;

//스레드를 사용한 입금

public class EX18_06 {
	private int money;

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}
}
