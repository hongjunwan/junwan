package lab1two;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileErrorTest {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("data.txt"));
	}
}
