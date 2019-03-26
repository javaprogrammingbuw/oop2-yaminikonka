
public class Square extends Shape{
	private double height;
	private double width;
	public Square(double height, double width){
		this.height=height;
		this.width=width;
	}
	public double area(){
		return height*width;
	}
	public double circumference(){
		return 2*(height+width);
	}
	public void setColor(int r, int g, int b){
    	super.setColor(r,g,b);
    }
    public void setColor(int color){
    	super.setColor(color);
    }
}