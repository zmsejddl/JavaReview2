package SECTION14_예외_처리.사용자_정의_예외_처리_05;

//사용자 정의 객체

public class EX14_11 extends Exception {
	private String message;

	public EX14_11(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	/*
	 * 해설
	 * 05: Exception 객체를 상속받습니다.
	 * 08~10: 객체를 선언할 때 예외 메시지를 입력받도록 합니다.
	 * 13~15: Exception이 지닌 getMessage() 메서드를 오버라이드하여 재정의합니다.
	 * 입력받은 메시지를 리턴합니다.
	 */
}
