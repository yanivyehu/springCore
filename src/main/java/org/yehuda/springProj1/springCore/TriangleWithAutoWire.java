package org.yehuda.springProj1.springCore;

public class TriangleWithAutoWire {
	
	Point point1; //bean with id point1 "auto wired" to this object
	Point point2;
	Point point3;
	
	public TriangleWithAutoWire() {
		// TODO Auto-generated constructor stub
	}

	public Point getPoint1() {
		return point1;
	}



	public void setPoint1(Point point1) {
		this.point1 = point1;
	}



	public Point getPoint2() {
		return point2;
	}



	public void setPoint2(Point point2) {
		this.point2 = point2;
	}



	public Point getPoint3() {
		return point3;
	}



	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void draw() {
		System.out.println("Print a Triangle with autowire--> " + point1 + "|" + point2 + "|" + point3);
	}

}
