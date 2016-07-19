import dir1.Vector;
import dir1.dir2.Tuple;
import dir1.VecTupSet;
import dir1.dir2.VecTupPair;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Hello, world!");

		Point point = new Point(2.3, 3);
		System.out.println("point = " + point);

		Vector vector = new Vector(2, 3.6);
		System.out.println("vector = " + vector);

		Tuple tuple = new Tuple(4.23, 8.37);
		System.out.println("tuple = " + tuple);

		VecTupSet set = new VecTupSet(vector, tuple);
		System.out.println(set);

		VecTupPair pair = new VecTupPair(vector, tuple);
		System.out.println(pair);
	}
}
