package Exo2;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println("The circle has radius of "
						   + c1.getRadius() 
						   + " and area of " 
						   + c1.getArea());
	
		Circle c2 = new Circle(2.0);
		System.out.println("The circle 2 has radius of "
			   + c2.getRadius() 
			   + " and area of " 
			   + c2.getArea());
	
		
		Circle c3 = new Circle(2.0, "purple");
		System.out.println("The circle 2 has radius of "
				   + c3.getRadius() 
				   + " and area of " 
				   + c3.getArea()
				   + " and his color is "
				   + c3.getColor());
		
		Circle c4= new Circle();
		c4.setRadius(4.5);
		System.out.println("radius is : " + c4.getRadius());
		c4.setColor("orange");
		System.out.println("color is : " + c4.getColor());
		
		Circle c5 = new Circle();
		c5.toString();
		
		Circle c6 = new Circle(6.6);
		System.out.println(c6.toString());  
		System.out.println(c6);             
		System.out.println("Operator '+' invokes toString() too: " + c6);

		
	}
} 