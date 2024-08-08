package SECTION19_파일_입출력.문자_기반_스트림_04;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//read(char[]) 메서드를 이용한 파일 읽기

public class EX19_09 {
	public static void main(String[] args) {
		// 파일을 읽어올 변수
		int read = 0;
		// 스트림 선언
		Reader in = null;

		try {
			in = new FileReader("file_korean.txt");
			char[] buffer = new char[256];

			while (true) {
				// 파일 읽기
				read = in.read(buffer);
				// -1이면 종료
				if (read == -1) {
					break;
				}
				System.out.print(String.valueOf(buffer, 0, read));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {

			try {
				// 객체가 사용 중이면 닫는다.
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 해설
	 * 18: 문자 타입 배열을 선언합니다.
	 * 22: 매개변수로 넘긴 배열에 문자를 저장하고, 읽어들인 문자의 개수를 반환합니다.
	 * 24: 더 이상 읽을 문자가 없다면 -1을 반환합니다.
	 * 27: 배열의 처음부터 읽어들인 수만큼 배열에서 꺼내어 문장으로 변환해 출력합니다.
	 */
}
