package org.yehuda.springProj1.springCore;

import java.util.List;

public class TriangleWithList {
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		System.out.println("Print a Triangle with a list " + points.get(0) + "|" + points.get(1) + "|" + points.get(2));
	}

}
