package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	 float x1,y1;
	 
	 Scanner sc = new Scanner(System.in);
	 public Point2D() {
		this(10,23);
	}
	 
	 public Point2D(float x1, float y1) {
			
			this.x1 = x1;
			
			this.y1 = y1;
		}
	 
	public void accept() {
		System.out.print("Enter X1 coordinates: ");
		x1 = sc.nextFloat();
		System.out.print("Enter Y1 coordinates: ");
		y1 = sc.nextFloat();
		
	}
	
	public String getDetails() {
				
		return "Point P("+this.x1 +","+this.y1+")";
	}
	
	public boolean isEqual(Point2D p) {
		
		if(this.x1 == p.x1 && this.y1 == p.y1)
		return true;
		
		return false;		
	}
	
	public double calculateDistance(Point2D p) {
		
		return Math.sqrt(Math.pow(p.x1 - this.x1, 2) + Math.pow(p.y1 - this.y1, 2));
	}

}
