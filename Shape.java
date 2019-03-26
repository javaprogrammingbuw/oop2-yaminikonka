import java.awt.Color;

public abstract class Shape{
	protected int color;
    public abstract double area();
    	// return null;
    // }
    public abstract double circumference();
    	// return null;
    // }
    public void  setColor(int r, int g, int b){
    	color = new Color(r,g,b).getRGB();
    }
    public void setColor(int color){
    	this.color=color;
    }

}