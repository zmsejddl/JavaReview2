package SECTION16_컬렉션_프레임워크.제네릭_02;

//데이터 저장 클래스

public class EX16_01 {
	private Object[] data;
	private int size;
	private int defaultSize = 10;

	public EX16_01() {
		data = new Object[defaultSize];
	}

	public EX16_01(int size) {
		data = new Object[size];
	}

	public void add(Object value) {
		data[size++] = value;
	}

	public Object get(int index) {
		return data[index];
	}

	public int size() {
		return size;
	}
	
	/*
	 * 해설
	 * 06: Object 타입 배열을 선언합니다.
	 * 07: 배열 크기 변수를 선언합니다.
	 * 08: 기본 배열 사이즈를 선언합니다.
	 * 10~12: 기본 생성자를 통해 배열을 기본 사이즈로 생서합니다.
	 * 14~16: 클래스 선언 시 받은 크기로 배열을 생성합니다.
	 * 18~20: 데이터가 들어오면 배열에 저장합니다.
	 * 22~24: 배열에 데이터가 있으면 반환하고 아니면 null을 반환합니다.
	 * 26~29: 저장된 데이터의 크기를 반환합니다.
	 */
}
