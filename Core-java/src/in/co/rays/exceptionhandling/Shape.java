package in.co.rays.exceptionhandling;

public class Shape {

	private String color;

	private int borderWidth;

	public Shape(String color, int borderWidth) throws IllegalArgumentException {
		if ((color == null)|| (borderWidth <= 10)) {
			IllegalArgumentException i = new IllegalArgumentException(
					"the color can't be null & borderwidth greater than zero");
			throw i ;
		}
		this.color = color;
		this.borderWidth = borderWidth;
	
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBorderWidth(int Width) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

}
