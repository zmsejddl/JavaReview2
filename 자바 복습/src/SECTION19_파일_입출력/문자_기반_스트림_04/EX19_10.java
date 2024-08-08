package SECTION19_파일_입출력.문자_기반_스트림_04;

import java.io.FileWriter;

//FileWriter 스트림

public class EX19_10 {
	public static void main(String[] args) {

		FileWriter w = null;
		try {
			// FileOutputStream처럼 이어쓰기, 덮어쓰기 모든 존재
			w = new FileWriter("fileText.txt", false);
			w.write('H');
			w.write('A');
			w.write('P');
			w.write('P');
			w.write('Y');
			w.write('\n');
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (w != null) {
					w.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 해설
	 * 13: FileWriter 객체를 선언합니다.
	 * 14~19: 한 문자씩 데이터를 출력합니다.
	 * 20: 작성 완료하여 출력합니다.
	 */
}
