package SECTION16_컬렉션_프레임워크.List_컬렉션_03;

import java.util.ArrayList;
import java.util.List;

//ArrayList 데이터 치환

public class EX16_05 {
	public static void main(String[] args) {

		// 리스트 선언
		List<String> list = new ArrayList<String>();

		// 데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");

		// 리스트 출력
		System.out.println("리스트 내용1: " + list);

		// 데이터 변환
		list.set(1, "복숭아");
		list.set(0, "딸기");

		System.out.println("리스트 내용2: " + list);
	}
}
