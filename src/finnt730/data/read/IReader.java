package finnt730.data.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.attribute.FileAttribute;

import javax.swing.filechooser.FileView;

import jdk.jfr.events.FileReadEvent;
import libs.FileName;

public class IReader {

	public static FileReader fileReader() {
		return null;
	}

	public static String fileNameStr = "";

	public static String NameFile() {
		return fileNameStr;
	}

	public static void ReadData() throws IOException {

		Integer letter = null;
		Integer hex = null;
		Integer number = null;

		// FileReader fr;
		// try {
		// fr = new FileReader(fileNameStr);
		//
		// String test = Integer.toBinaryString(10);
		//
		// char[] a = new char[10];
		// fr.read(a); // reads the content to the array
		// for (char c : a) {
		// System.out.print(c + "\r"); // prints the characters one by one
		// }
		// fr.close();
		//
		// System.out.println(test);
		//
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		Reader fileReader = new FileReader("Test.txt");

		int data = fileReader.read();
		while (data != -1) {
			// do something with data...
			System.out.println((char)data);
			
			System.out.println((byte)data);
			
			if(data == 50) {
				System.out.println("DIT IS #1!!!!! ;)");
			}

			data = fileReader.read();
		}
		fileReader.close();

	}

}
