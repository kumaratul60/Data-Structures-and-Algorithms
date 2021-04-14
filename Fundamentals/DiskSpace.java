package Fundamentals;

import java.io.File;

public class DiskSpace {
	public static void main(String[] args) {
		File file = new File("C:\\");

		double size = file.getFreeSpace() / (1024.0 * 1024 * 1024);
		//double sizeFree = new File("C:\\").getUsableSpace() / (1024.0 * 1024 * 1024);
		System.out.printf("%.3f GB\n", size);
	}

}
