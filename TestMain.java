import dir1.Vector;
import dir1.dir2.Tuple;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Hello, world!");

		Point point = new Point(2.3, 3);
		System.out.println("point = " + point);

		Vector vector = new Vector(2, 3.6);
		System.out.println("vector = " + vector);

		Tuple tuple = new Tuple(4.23, 8.37);
		System.out.println("tuple = " + tuple);
	}
}
