package Exo3;

public class Circle2 {
	double radius = 1.0;

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	
}
