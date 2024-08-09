package SECTION19_파일_입출력.보조_스트림_05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStreamReader

public class EX19_16 {
	public static void main(String[] args) {

		FileInputStream in = null;
		InputStreamReader is = null;

		try {
			in = new FileInputStream("read.txt");
			is = new InputStreamReader(in, "UTF-8");

			int read = 0;

			while ((read = is.read()) != -1) {
				System.out.print((char) read);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 16: FileInputStream을 선언합니다.
	 * 17: InputStreamReader를 선언합니다.
	 * 바이트 -> 문자 타입으로 변환 시 사용할 encoding을 지정합니다. 
	 */
}
