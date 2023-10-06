package 메서드연습;

import java.io.File;
import java.util.Arrays;

public class 파일테스트 {

	public static void main(String[] args) {
		File file = new File("test.txt"); //폴더와 파일
		boolean result = file.exists(); // void X. boolean
		System.out.println(result);
		System.out.println(file.isDirectory());
		
		File folder = new File("."); // folder=directory=package. 현재 폴더 . / 그 위 폴더 ..
		System.out.println(folder.isDirectory());
		String[] list = folder.list();
		System.out.println(Arrays.toString(list));
	}

}
