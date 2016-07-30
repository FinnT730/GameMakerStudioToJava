package testing;

import java.io.IOException;

import finnt730.data.read.IReader;
import finnt730.data.read.IWritter;

public class MainTest {

	public MainTest() {
		// TODO Auto-generated constructor stub
	}

	private static IWritter w = new IWritter();
	private static IReader r = new IReader();

	public static void main(String[] args) {
		String test = "if()";
		w.str = test;

		w.WriteData();

		r.fileNameStr = "Test.gjc";
		try {
			r.ReadData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
