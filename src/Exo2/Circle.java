package Exo2;

public class Circle {
	private double radius;
	private String color;
		
	public Circle() {
		radius = 1.0;
		color = "red";
	}
		
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
		
	public double getArea() {
		return radius*radius*Math.PI;
	}
	

	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}

