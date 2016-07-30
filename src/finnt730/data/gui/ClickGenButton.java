package finnt730.data.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import finnt730.data.read.IWritter;
import libs.FileName;

public class ClickGenButton implements ActionListener {
	
	public static MainGui mg = new MainGui();

	@Override
	public void actionPerformed(ActionEvent e) {
		File str = new File("");
		if(mg.jf.getSelectedFile() == mg.jf.getSelectedFile()) {
			str = mg.jf.getSelectedFile();
		}
		
		
		char[] str2 = str.toString().toCharArray();
		int tmp = str2.length;
		
		
		for(char c : str2) {
			IWritter.str = "".concat("" + tmp);
		}
		
		
		IWritter.str = "" + tmp;
		
		FileName.FileName = str.toString();
		IWritter.WriteData();
		
		System.out.println(str);
		
	}

}
