package org.yehuda.springProj1.springCore;

public class Triangle {
	
	String type;
	int height;
	
	public Triangle() { } //Needed by beans that creats an object with default c'tor

	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("Print a Triangle with type:" + type + " ,height:" + height);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
