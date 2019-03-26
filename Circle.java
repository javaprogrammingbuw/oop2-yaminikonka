
public class Circle extends Shape{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double circumference(){
		return 2*Math.PI*radius;
	}
	public void setColor(int r, int g, int b){
    	super.setColor(r,g,b);
    }
    public void setColor(int color){
    	super.setColor(color);
    }

}