package org.yehuda.springProj1.springCore;

public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		System.out.println("Circle: Point is" + center.getX() + "," + center.getY());
	}

}
