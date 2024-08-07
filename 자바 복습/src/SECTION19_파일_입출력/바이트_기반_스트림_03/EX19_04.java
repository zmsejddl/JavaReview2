package SECTION19_파일_입출력.바이트_기반_스트림_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//byte 배열을 이용해 출력하기

public class EX19_04 {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
			out = new FileOutputStream("write_array.txt", false);
			String str = "hello world";
			// 문장을 바이트 배열로 변환하여 반환
			byte[] strArray = str.getBytes();
			out.write(strArray);

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
	 * 14: 파일에 저장할 문자열을 생성합니다.
	 * 16: 문자열을 바이트 배열 타입으로 변환하여 반환합니다.
	 * 17: 바이트 배열 타입으로 변환된 문자를 출력합니다.
	 * 25: 사용을 마친 객체를 닫습니다.
	 */
}
