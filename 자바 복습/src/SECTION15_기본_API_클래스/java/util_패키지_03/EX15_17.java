package SECTION15_기본_API_클래스.java.util_패키지_03;

import java.util.Calendar;
import java.util.Scanner;

//Calendar 클래스를 이용해 달력 만들기

public class EX15_17 {
	public static void main(String[] args) {
		// Calendar 객체 생성 (오늘의 정보)
		Calendar cal = Calendar.getInstance();

		Scanner scan = new Scanner(System.in);

		System.out.println("연도를 입력하세요.");
		int year = scan.nextInt();

		System.out.println("월을 입력하세요");
		int month = scan.nextInt();

		// Calendar 클래스는 월의 시작이 0부터 시작
		cal.set(year, month - 1, 1);

		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		// 지정한 달의 시작하는 요일을 구함
		int week = cal.get(Calendar.DAY_OF_WEEK);

		// 달력 시작 날의 주말 처리
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			// 토요일에 날짜를 표시하고 줄 바꿈 하는 코드
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}

		scan.close();
	}
	/*
	 * 해설
	 * 26: 월의 마지막 일자를 반환합니다.
	 * 28: 시작하는 주의 위치를 구합니다.
	 * 31~33: 시작하는 위치 전까지 공백을 넣습니다.
	 * 35~42: 달력 날짜를 입력합니다.
	 */
}
