package me.cameronwitcher.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

import res.Texture;

public class Screen extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int LEVEL_DEBUG = 6;
	private int mx = 0;
	private int my = 0;
	Timer timer;

	public Screen() {
		init();
	}

	public void init() {

		timer = new Timer(15, this);
		timer.start();

		addKeyListener(new TAdapter());
		addMouseMotionListener(new MMListener());
		addMouseListener(new MListener());
		
		
		setLayout(null);

		setFocusable(true);

		setPreferredSize(new Dimension(1920, 1080));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawMenu(g);
		Toolkit.getDefaultToolkit().sync();
	}

	public void drawMenu(Graphics g) {
		
		g.drawImage(Texture.loadTexture("desktop.jpg"), 0, 0, 1920, 1080, this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	private class TAdapter extends KeyAdapter {
		
		

		@Override
		public void keyReleased(KeyEvent event) {
			
		}

		@Override
		public void keyPressed(KeyEvent event) {
			
		}
	}

	private class MMListener extends MouseMotionAdapter {

		public void mouseMoved(MouseEvent e) {
			mx = e.getX();
			my = e.getY();
			
			

		}
	}

	private class MListener extends MouseAdapter {

		public void mousePressed(MouseEvent e) {
			
		}

		public void mouseReleased(MouseEvent e) {
			
		}
	}

}
