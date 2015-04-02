/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;
import java.awt.Point;

/**
 *
 * @author G3318
 */
public class LocPoint 
{
	
	private Point point;
	private String title;
	private String description;
	private int number;
	

public LocPoint(){}
public LocPoint( Point point, String title, String desc)
{
	
	this.title =title;
	this.point=point;
	this.description =desc;
}

	public void setPoint(Point ln){ this.point =ln;}
	public void setTitle(String t) {title =t;}
	public void setDescription(String desc) {this.description =desc;}
	public void setNumber(int i) {this.number =i;}
	public Point getPoint() { return point;}
	public String getDesc() {return description;}
	public String getTitle() {return title;}
	public int getNumber() {return number;}
	
	@Override
	public String toString()
	{ return title+": "+description;}
	
	
}

