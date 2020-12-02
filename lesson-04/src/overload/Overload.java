package overload;

public class Overload {

	private int length;
	private double heigth;

	public Overload(int length, double heigth) {
		this.length = 27;
		this.heigth = 20.5;
	}

	public Overload() {
		this.length = 30;
		this.heigth = 25.5;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public String toString() {
		return "Overload [length=" + length + ", heigth=" + heigth + "]";
	}

}