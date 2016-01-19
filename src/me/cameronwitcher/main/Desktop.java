package me.cameronwitcher.main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Desktop extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Desktop(){
		setPreferredSize(new Dimension(1920/2, 1080/2));
		pack();
		add(new Screen());
		
		setVisible(true);
	}

}
