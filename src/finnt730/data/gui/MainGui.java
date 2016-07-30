package finnt730.data.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MainGui extends JFrame{

	
	public static void main(String[] args) {
		new MainGui().setVisible(true);
	}
	
	
	public static JButton jb = new JButton("GEN");
	public static JFileChooser jf = new JFileChooser();
	
	public MainGui() {
		super("This is an compiler!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		this.setLayout(new FlowLayout());
		
		jb.addActionListener(new ClickGenButton());
		
		
		add(jb);
		add(jf);
		
	}

}
