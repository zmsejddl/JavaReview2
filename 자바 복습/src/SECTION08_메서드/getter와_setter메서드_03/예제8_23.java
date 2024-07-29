package SECTION08_메서드.getter와_setter메서드_03;

//필드에 대한 접근 강화하기

public class 예제8_23 {
	public static void main(String[] args) {
		예제8_22 kim = new 예제8_22();
		kim.setAge(-30);
		kim.setAge(30);
		System.out.println("kim의 나이는 " + kim.getAge() + "세입니다.");
	}
}
