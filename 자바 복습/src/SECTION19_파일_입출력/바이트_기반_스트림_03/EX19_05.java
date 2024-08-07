package SECTION19_파일_입출력.바이트_기반_스트림_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//read()와 write()를 이용한 이미지 복사

public class EX19_05 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("back.jpg");
			out = new FileOutputStream("back_copy.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while ((read = in.read()) != -1) {
				out.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println(time + "초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
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
	 * 16: 현재 시간을 1/1000초 단위로 나타냅니다.
	 * 19~21: 읽은 이미지를 그대로 씁니다.
	 * 23: 이미지 복사가 완료된 시점의 시간을 출력합니다.
	 * 24: 시간의 차이를 구합니다.
	 * 25: 이미지를 복사하는 데 걸린 시간을 출력합니다.
	 */
}
