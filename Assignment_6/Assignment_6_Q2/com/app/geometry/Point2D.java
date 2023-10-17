package com.app.geometry;
import java.lang.Math;
public class Point2D {
	private int x;
	private int y;

	public Point2D() {

	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getDetails()
	{
		return this.x+","+this.y;
	}
	
	public boolean isEqual(Point2D point2D)
	{
		if(this.x==point2D.x && this.y==point2D.y)
			return true;
		return false;
	}
	
	public double calculateDistance(Point2D point2D) {
		double x=Math.pow((point2D.x-this.x),2);
		double y=Math.pow((point2D.y-this.y),2);
		double d=Math.sqrt(x+y);
		return d;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
