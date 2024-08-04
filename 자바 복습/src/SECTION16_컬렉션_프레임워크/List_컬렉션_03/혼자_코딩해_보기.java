package SECTION16_컬렉션_프레임워크.List_컬렉션_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//랜덤 함수를 이용해 10개의 수를 추출하여 List에 저장한 후 저장된 값들 중 최대값과 최소값을 구하는 코드를 작성해 보세요.

public class 혼자_코딩해_보기 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			int temp = (int) (Math.random() * 30) + 1;
			list.add(temp);
		}

		System.out.println("전체 데이터: " + list);

		// 첫 번째 방법
		int max1 = Collections.max(list);
		int min1 = Collections.min(list);

		System.out.println("최대값: " + max1 + ", 최소값: " + min1);

		// 두 번째 방법
		int max2 = list.get(0);
		int min2 = list.get(0);

		for (int num : list) {
			if (num > max2) {
				max2 = num;
			}
			if (num < min2) {
				min2 = num;
			}
		}

		System.out.println("최대값: " + max2 + ", 최소값: " + min2);
	}
}
