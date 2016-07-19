package dir1.dir2;		//packageが先
import dir1.Vector;		//importが後
import dir1.dir2.Tuple;

public class TestMain3 {
	public static void main(String[] args) {
		System.out.println("here is dir2");

		//下の行はコンパイルエラーになる
		//なんでや
		//Point point = new Point(1.4, 4.6);
		//System.out.println(point.toString());

		Vector vector = new Vector(1.2, 4.9);
		System.out.println("vector = " + vector);

		Tuple tuple = new Tuple(3.5, 6.2);
		System.out.println("tuple = " + tuple);
	}
}