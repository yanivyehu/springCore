package org.yehuda.springProj1.springCore;

public class TriangleWithPoints {
	
	Point pointA;
	Point pointB;
	Point pointC;
	
	public TriangleWithPoints() {
		// TODO Auto-generated constructor stub
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Print a Triangle with points--> " + pointA + "|" + pointB + "|" + pointC);
	}

}
