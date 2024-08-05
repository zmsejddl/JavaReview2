package SECTION16_컬렉션_프레임워크.Set_컬렉션_04;

import java.util.HashSet;
import java.util.Set;

//HashSet 데이터 삭제

public class EX16_11 {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		// 데이터 삽입
		set.add("apple");
		set.add("mango");
		set.add("banana");
		set.add("melon");

		System.out.println("set items: " + set);

		// 데이터 삭제
		set.remove("banana");
		set.remove("mango");

		System.out.println("set items: " + set);
	}
	/*
	 * 해설
	 * 21~22: HashSet 데이터를 삭제합니다.
	 */
}
