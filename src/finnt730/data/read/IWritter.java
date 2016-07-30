package finnt730.data.read;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IWritter {

	public IWritter() {
		// TODO Auto-generated constructor stub
	}
	
	public static String str = "";
	
	public static String getString() {
		return str;
	}

	public static void WriteData() {
		File file = new File("Test.txt");

		try {
			FileWriter fileW = new FileWriter(file);

			fileW.write(getString());

			fileW.flush();
			fileW.close();
			
			IReader.ReadData();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
