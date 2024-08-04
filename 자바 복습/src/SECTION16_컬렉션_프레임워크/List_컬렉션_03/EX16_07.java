package SECTION16_컬렉션_프레임워크.List_컬렉션_03;

import java.util.ArrayList;
import java.util.List;

//데이터 가져오기

public class EX16_07 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		// List에 랜덤 함수를 이용해 값을 넣는다.
		for (int i = 1; i < 10; i++) {
			int temp = (int) (Math.random() * 30) + 1;
			list.add(temp);
		}

		System.out.println("전체 데이터: " + list);

		// List에 담긴 데이터 중 짝수만 출력
		System.out.print("짝수: ");
		for (int i = 0; i < list.size(); i++) {
			// List에서 각 index에 위치하는 값 가져오기
			int value = list.get(i);
			if (value % 2 == 0) {
				System.out.print(value + " ");
			}
		}
	}
	/*
	 * 해설
	 * 14~17: 랜덤 함수를 이용해 List에 값을 대입합니다.
	 * 23~29: 저장된 값들 중에서 짝수만 출력합니다.
	 */
}
