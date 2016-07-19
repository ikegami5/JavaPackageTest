package dir1.dir2;

public class Tuple {
	private double x;
	private double y;

	public Tuple(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + new Double(this.x).toString() + ", " + new Double(this.y).toString() + ")";
	}
}