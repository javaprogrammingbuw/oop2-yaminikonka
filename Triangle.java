
public class Triangle extends Shape implements iRightAngled{
    private double a;
    private double b;
    public Triangle(double a,double b){
    	this.a=a;
    	this.b=b;
    }
    public double pythagoras(){
        return Math.sqrt(a*a+b*b);
    }
    public double area(){
    	return 0.5*a*b;
    }
    public double circumference(){
    	double c=pythagoras();
    	return a+b+c;
    }
    public void setColor(int r, int g, int b){
    	super.setColor(r,g,b);
    }
    public void setColor(int color){
    	super.setColor(color);
    }
}