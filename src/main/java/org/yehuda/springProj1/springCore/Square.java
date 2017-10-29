package org.yehuda.springProj1.springCore;

public class Square implements Shape{

	Point leftUp;
	Point leftDown;
	Point rightUp;
	Point rightDown;
	
	
	public Point getLeftUp() {
		return leftUp;
	}


	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}


	public Point getLeftDown() {
		return leftDown;
	}


	public void setLeftDown(Point leftDown) {
		this.leftDown = leftDown;
	}


	public Point getRightUp() {
		return rightUp;
	}


	public void setRightUp(Point rightUp) {
		this.rightUp = rightUp;
	}


	public Point getRightDown() {
		return rightDown;
	}


	public void setRightDown(Point rightDown) {
		this.rightDown = rightDown;
	}


	public void draw() {
		System.out.println("Square: points ->" +  this.leftUp + this.leftDown + this.rightUp + this.rightDown);
		
	}

}
