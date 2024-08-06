package SECTION18_스레드.스레드_상태_04;

//저장 클래스 구현

class AddStackThread extends Thread {
	private EX18_13 storage;

	public AddStackThread(EX18_13 storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				if (this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class PopStackThread extends Thread {
	private EX18_13 storage;

	public PopStackThread(EX18_13 storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public class EX18_14 {
		public static void main(String[] args) {
			EX18_13 s = new EX18_13();
			AddStackThread add = new AddStackThread(s);
			PopStackThread pop = new PopStackThread(s);

			add.start();
			pop.start();
		}
	}
	/*
	 * 해설
	 * 05: 짐을 쌓는 스레드를 생성합니다.
	 * 16: 스레드 속도를 위해서 1초 지연합니다.
	 * 17~20: 짐이 0개일 때 10개를 채웁니다.
	 * 28: 짐을 치우는 스레드를 생성합니다.
	 * 39: 스레드 속도를 위해서 1초 지연합니다.
	 * 41: 짐을 5개씩 나릅니다.
	 */
}
