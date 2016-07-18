package dir1;			//packageが先
import dir1.Vector;		//importが後

// java dir1.TestMain2 で動く
public class TestMain2 {
	public static void main(String[] args) {
		System.out.println("Here is dir1");

		//下の文はなぜかコンパイルエラーになる
		//なんでや
		//Point point = Point(3.4, 1);
		//System.out.println(point);

		Vector vector = new Vector(4.82, 6.21);
		System.out.println(vector);
	}
}
