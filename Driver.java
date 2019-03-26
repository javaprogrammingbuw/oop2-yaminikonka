
public class Driver{
	public static void main(String[] args){
		Shape s;  // abstract method can not be instantiated
		Shape t=new Triangle(2,4);
		Shape c=new Circle(5);
		s=new Square(4,4);
		t.setColor(255,0,0);
		c.setColor(0,255,0);
		s.setColor(0,0,255);
		System.out.println("the area of the triangle: "+t.area()+"\nthe circumference of the triangle: "+t.circumference()+"\nthe color of the triangle: "+t.color);
		System.out.println("the area of the circle: "+c.area()+"\nthe circumference of the circle: "+c.circumference()+"\nthe color of the circle: "+c.color);
		System.out.println("the area of the square: "+s.area()+"\nthe circumference of the square: "+s.circumference()+"\nthe color of the square: "+s.color);
	}
}