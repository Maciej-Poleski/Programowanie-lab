package laboratorium07.zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Cat {

	public static void cat(File file) {
		RandomAccessFile input = null;
		String line = null;

		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {

				}
			}
		}
	}
}