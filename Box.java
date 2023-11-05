
public class Box {
	private double length;
	private double depth;
	private double height;
	private String color;

	// constructor with length,depth,height and color used to create object
	public Box(double length, double depth, double height, String color) {

		// this refers current class instance
		this.length = length;
		this.depth = depth;
		this.height = height;
		this.color = color;
	}

	// getter and setter methods
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// method to calculate volume of box
	public double getVolume() {
		return length * depth * height;
	}

	// to string method
	public String toString() {
		return "Length = " + String.format("%.2f", length) + "\n" + "Depth = " + String.format("%.2f", depth) + "\n"
				+ "Height = " + String.format("%.2f", height) + "\n" + "Color = " + color + "\n" + "Volume = "
				+ String.format("%.2f", getVolume()) + "\n";
	}

}
