package org.yehuda.springProj1.springCore;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		// TODO Auto-generated constructor stub
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
	
	@Override
	public String toString() {
		return "(x:"+ x + ",y:"+y+")";
	}
}
