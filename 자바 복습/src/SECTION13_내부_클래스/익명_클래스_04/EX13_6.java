package SECTION13_내부_클래스.익명_클래스_04;

//익명 내부 클래스 예제

interface buttonClickListener {
	public void click();
}

public class EX13_6 {
	// 버튼 객체를 내부 클래스로 선언
	public class Button {
		private buttonClickListener listener;

		// 리스터를 파라미터를 통해 받는다.
		public void setButtonClockLostener(buttonClickListener listener) {
			this.listener = listener;
		}

		// 버튼 클릭 기능
		public void click() {
			if (listener != null) {
				this.listener.click();
			}
		}
	}

	public static void main(String[] args) {
		EX13_6 exam = new EX13_6();
		EX13_6.Button button = exam.new Button();

		button.setButtonClockLostener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});

		button.click();
	}
	
	/*
	 * 해설
	 * 05: 버튼 클릭 이벤트를 지닌 인터페이스를 선언합니다.
	 * 11: 인스턴스 클래스로 버튼 객체를 선언합니다.
	 * 15: 버튼 리스터를 외부로부터 받는 메서드를 구현합니다.
	 * 20~24: 버튼을 클릭하는 메서드를 구현합니다. 리스터가 있을 때만 동작하도록 제어합니다.
	 * 28~29: 외부 클래스를 통해서 버튼 클래스를 선언합니다.
	 * 31~36: 인터페이스를 익명 클래스로 선언하여 버튼 기능을 구현해 추가합니다.
	 * 38: 버튼을 클릭합니다.
	 */
}
