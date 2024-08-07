package SECTION19_파일_입출력.바이트_기반_스트림_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//배열을 이용한 이미지 복사

public class EX19_06 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("back.jpg");
			out = new FileOutputStream("back_copy.jpg");
			byte[] buffer = new byte[512];
			// 현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while ((read = in.read(buffer)) != -1) {
				out.write(buffer, 0, read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double) (end - start) / 1000;
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
	 * 16: 바이트 타입의 배열을 생성합니다.
	 * 21~23: 배열을 사용하여 읽어오고 읽어온 만큼 씁니다.
	 */
}
