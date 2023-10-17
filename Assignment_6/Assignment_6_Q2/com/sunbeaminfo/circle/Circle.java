package com.sunbeaminfo.circle;

import java.util.Scanner;

import com.app.geometry.Point2D;
import com.sunbeaminfo.exception.CircleException;

public class Circle{
	Point2D centerPoint;
	double diameter;
	
	public Circle() {
		super();
		centerPoint.setX(0);
		centerPoint.setY(0);
		this.diameter = 100;
	}

	public int getX()
	{
		return centerPoint.getX();
	}
	public int getY()
	{
		return centerPoint.getY();
	}
	public double getDiameter() {
		return diameter;
	}
	
	public void checkDiameter(double diameter) throws CircleException
	{
		this.diameter=diameter;
		if(this.diameter<0)
			throw new CircleException("Diamter is negative");
	}

	public Circle(Point2D centerPoint, double diameter) {
		super();
		this.centerPoint = centerPoint;
		this.diameter = diameter;
	}
	
	public void acceptData() throws CircleException
	{
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.print("Enter Diameter:");
		diameter=scanner.nextDouble();
		if(diameter<0)
			throw new CircleException("Diameter is negative");
		}
		finally
		{
		scanner.close();	
		}
	}

	@Override
	public String toString() {
		return "Circle [centerPoint=" + centerPoint.toString() + ", diameter=" + diameter + "]";
	}
	
	
	
}
