package SECTION15_기본_API_클래스.java.lang_패키지_02;

//toString() 메서드를 재정의하여 객체의 정보를 반환

public class EX15_06 {

	private String carName;
	private String company;

	public EX15_06(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}

	@Override
	public String toString() {
		String str = "차량 이름: " + this.carName + ", 제조사: " + this.company;
		return str;
	}
	
	/*
	 * 해설
	 * 15~19: toString() 메서드를 override하여 EX15_06 객체가 지닌 정보를 반환하도록 수정했습니다.
	 */
}
