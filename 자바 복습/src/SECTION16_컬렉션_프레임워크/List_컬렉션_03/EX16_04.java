package SECTION16_컬렉션_프레임워크.List_컬렉션_03;

import java.util.ArrayList;
import java.util.List;

//ArrayList 추가

public class EX16_04 {
	public static void main(String[] args) {

		// 리스트 선언
		List<String> list = new ArrayList<String>();

		// 데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");

		// 리스트 출력
		System.out.println("리스트 내용1: " + list);

		// 3번째 위치에 삽입
		list.add(2, "수박");

		System.out.println("리스트 내용2: " + list);
	}
	
	/*
	 * 해설
	 * 12: String 타입의 데이터를 저장하는 리스트를 선언합니다.
	 * 15~17: 데이터 삽입
	 * 20: 리스트는 toString()이 Override 되어 있으므로 그대로 출력할 수 있습니다.
	 */
}
