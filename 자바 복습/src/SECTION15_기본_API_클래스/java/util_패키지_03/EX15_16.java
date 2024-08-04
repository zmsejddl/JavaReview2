package SECTION15_기본_API_클래스.java.util_패키지_03;

import java.util.Calendar;

//Calendar 클래스

public class EX15_16 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다.");
	}
	/*
	 * 해설
	 * 12~14: 상수 필드 값을 이용해 원하는 날짜의 정보를 얻습니다.
	 * 이때, MONTH의 매개변수로 +1을 넘겨주는 이유는 Calendar 클래스는 0~11을 월의 값으로 변환해 주기 때문입니다.
	 */
}
