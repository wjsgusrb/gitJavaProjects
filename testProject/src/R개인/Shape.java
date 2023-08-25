package R개인;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color;
	public Shape() {
		color = "white";
	}

	Shape(int type,double height, double width){

	}
	public int getType() {
		return type;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public String getColor() {
		return color;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void setType(int type) {
		this.type =type;
	}
	public void setWidth(double width) {
		this.width =width;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String infomation() {
		return ""+type+height+width;

	}








}

