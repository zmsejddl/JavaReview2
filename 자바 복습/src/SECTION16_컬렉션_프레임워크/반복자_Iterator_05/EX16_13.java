package SECTION16_컬렉션_프레임워크.반복자_Iterator_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set의 Iterator

public class EX16_13 {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		// 데이터 삽입
		for (int i = 1; i <= 10; i++) {
			set.add(i);
		}
		// Iterator 객체 가져오기
		Iterator<Integer> iter = set.iterator();

		int count = 0;
		// 반환할 요소가 있는지 검사
		while (iter.hasNext()) {
			// 요소 반환
			int val = iter.next();
			System.out.println("set 데이터[" + (count++) + "] :" + val);
		}
	}
	/*
	 * 해설
	 * 18: Set의 Iterator 객체를 가져옵니다.
	 * 22: while 문의 조건으로 iterator가 순회할 수 있는지 검색합니다.
	 * 24~25: 데이터를 반환하여 출력합니다.
	 */
	
	/*
	 * TIP
	 * 앞에서 학습했던 향상된 for 문은 Iterator를 기반으로 구현되어 있습니다.
	 * List 계열의 컬렉션의 경우 index를 이용한 for 문보다는 Iterator를 이용하거나, 향상된 for 문을 사용하는 것이 성능 향상에 도움이 됩니다.
	 */
}
