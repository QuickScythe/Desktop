package me.cameronwitcher.main;

import javax.swing.JFrame;

public class Desktop extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Desktop(){
		pack();
		add(new Screen());
		
		setVisible(true);
	}

}
