package me.cameronwitcher.main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Icon {
	
	private Point location;
	private Image image;
	private String name;
	


	public Icon(String name, Image image, Point point){
		this.name = name;
		this.image = image;
		this.location = point;
		
	}
	
	public Icon(String name, Image image, int x, int y){
		this.name = name;
		this.image = image;
		location = new Point(x,y);
	}
	
	public Icon(String name, Image image){
		this.name = name;
		this.image = image;
		location = new Point(0,0);
	}
	
	public Point getLocation(){
		return location;
	}
	
	public void setLocation(Point point){
		location = point;
	}
	public void setLocation(int x, int y){
		location = new Point(x,y);
	}
	
	public Image getImage(){
		return image;
	}
	public String getName(){
		return name;
	}

	public void drawIcon(Graphics g){
		g.drawImage(image, (int) location.getX(), (int) location.getY(), 25, 25, null);
	}
	
	

}
