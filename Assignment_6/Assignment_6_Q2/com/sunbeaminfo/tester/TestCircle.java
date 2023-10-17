package com.sunbeaminfo.tester;

import com.app.geometry.Point2D;
import com.sunbeaminfo.circle.Circle;
import com.sunbeaminfo.exception.CircleException;

public class TestCircle {

	public static void main(String[] args) {
		Point2D point=new Point2D(2,2);
		Circle circle=new Circle(point,-1);
		try {
		circle.checkDiameter(-1);
//		circle.acceptData();
		}
		catch(CircleException ce)
		{
		System.out.println(ce);	
		}
		finally
		{
			System.out.println(circle);
		}
	}

}
