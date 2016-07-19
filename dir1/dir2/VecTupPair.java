package dir1.dir2;		//packageが先
import dir1.Vector;		//importが後
import dir1.dir2.Tuple;

public class VecTupPair {
	private Vector vector;
	private Tuple tuple;

	public VecTupPair(Vector vector, Tuple tuple) {
		this.vector = vector;
		this.tuple = tuple;
	}

	public String toString() {
		return "VecTupPair(" + this.vector + ", " + this.tuple + ")";
	}
}