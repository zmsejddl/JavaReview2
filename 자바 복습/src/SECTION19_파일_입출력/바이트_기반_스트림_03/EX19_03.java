package SECTION19_파일_입출력.바이트_기반_스트림_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//1byte씩 출력하기

public class EX19_03 {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
			out = new FileOutputStream("write.txt", false);
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 객체가 사용 중이라면 닫는다.
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 해설
	 * 11: OutputStream을 선언합니다.
	 * 13: 파일 객체를 선언합니다.
	 * 파일을 생성할 위치와 이어쓰기 옵션을 매개변수로 전달합니다.
	 * 14~18: write() 메서드를 이용해 문자를 출력합니다.
	 */
}
