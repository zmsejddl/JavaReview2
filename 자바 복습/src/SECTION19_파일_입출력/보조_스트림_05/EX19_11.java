package SECTION19_파일_입출력.보조_스트림_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//BufferedInputStream

public class EX19_11 {
	public static void main(String[] args) {
		// 보조 스트림 사용
		FileInputStream in = null;
		BufferedInputStream bis = null;
		try {
			in = new FileInputStream("fileText.txt");
			bis = new BufferedInputStream(in);
			int read = 0;

			// 보조 스트림을 사용하면 라인 단위로 읽어올 수 있다.
			while ((read = bis.read()) != -1) {
				System.out.print((char) read);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 여러 개를 닫을 때는 나중에 선언한 것부터 닫으면 된다.
				if (bis != null) {
					bis.close();
				}

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
	 * 12: FileInputStream 객체를 선언합니다.
	 * 13: BufferedInputStream을 선언합니다.
	 * 20~22: 버퍼를 이용해 파일을 읽습니다.
	 * 29~35: 사용한 객체를 닫습니다.
	 */
}
