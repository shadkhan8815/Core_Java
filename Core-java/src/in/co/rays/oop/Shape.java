package in.co.rays.oop;

public class Shape {

	private String color;

	private int borderWidth;

	public void setColor(String c) {   //public void setColor(String color);
		color = c;                     //this.color = color;
	}

	public String getColor() {
		return color;
		
	}

	public void setBorderWidth(int bw) {   // public void setBorderWidth(int borderWidth);
		borderWidth = bw;                  // this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;

	}

}
