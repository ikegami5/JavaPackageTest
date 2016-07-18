package dir1;

public class Vector {
	double x;
	double y;

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + new Double(this.x).toString() + ", " + new Double(this.y).toString() + ")";
	}
}