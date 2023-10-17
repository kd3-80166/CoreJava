package tester;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D pd = new Point2D();
		pd.accept();
		pd.getDetails();
		
		Point2D pd2 = new Point2D();
		pd.accept();
		pd2.getDetails()
		
		System.out.println(pd.getDetails());
		
		if (pd.isEqual(pd2))
			System.out.println("Points are in same location ");
		else {
			System.out.println("Points are  in different locations ");
			
			System.out.println("Distance between points "+pd.calculateDistance(pd2));
		}
	}

}
