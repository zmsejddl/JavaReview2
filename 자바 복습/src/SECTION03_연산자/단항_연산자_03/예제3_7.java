package SECTION03_연산자.단항_연산자_03;

public class 예제3_7 {
	public static void main(String[] args) {
		// 증감 연산자 <문자형>

		char alphabetX = 'X'; // 유니코드 정수 88로 저장되어 'X'와 매핑
		System.out.println(alphabetX++); // alphabetX가 출력된 후, 88+1=89가 됨
		System.out.println(alphabetX); // 89와 매핑된 'Y'가 출력됨
	}
}
