package SECTION19_파일_입출력.보조_스트림_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//보조 스트림 읽기 성능 테스트

public class EX19_12 {
	public static void main(String[] args) {
		FileInputStream readFile = null; // 기반 스트림
		FileInputStream bisReadFile = null; // 보조 스트림에 사용할 기반 스트림
		BufferedInputStream bis = null; // 보조 스트림

		try {
			System.out.println("기본 스트림으로 읽기 시작");
			readFile = new FileInputStream("back.jpg");
			// 현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작1");
			while (readFile.read() != -1) {
				// 이미지 읽기
			}
			System.out.println("이미지 읽기 종료1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;

			System.out.println("소요 시간: " + time + "초");
			System.out.println("기본 스트림으로 읽기 종료");

			System.out.println("보조 스트림으로 읽기 시작");
			bisReadFile = new FileInputStream("back.jpg");
			bis = new BufferedInputStream(bisReadFile);
			// 현재 시간을 m/s 단위로 나타냄.
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작2");
			while (bis.read() != -1) {
				// 이미지 읽기
			}

			System.out.println("이미지 읽기 종료2");
			end = System.currentTimeMillis();
			double result = (double) (end - start) / 1000;

			System.out.println("소요 시간: " + result + "초");
			System.out.println("보조 스트림으로 읽기 종료");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 여러 개를 닫을 때는 나중에 선언한 것부터 닫으면 된다.
				if (bis != null) {
					bis.close();
				}
				if (bisReadFile != null) {
					bisReadFile.close();
				}
				if (readFile != null) {
					readFile.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 해설
	 * 11~12: FileInputStream 객체를 선언합니다.
	 * 13: BufferedInputStream을 선언합니다.
	 * 19: 현재 시간을 초 단위로 반환합니다.
	 * 21~23: FileInputStream을 통해 이미지를 읽습니다.
	 * 26: 이미지를 읽는데 걸린 시간을 초 단위로 환산합니다.
	 * 33: 보조 스트림을 선언합니다.
	 * 37~39: 보조 스트림을 사용하여 이미지를 읽습니다.
	 */
}
