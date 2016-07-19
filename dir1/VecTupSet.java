package dir1;		//packageが先
import dir1.Vector;		//importが後
import dir1.dir2.Tuple;

public class VecTupSet {
	private Vector vector;
	private Tuple tuple;

	public VecTupSet(Vector vector, Tuple tuple) {
		this.vector = vector;
		this.tuple = tuple;
	}

	public String toString() {
		return "VecTupSet(" + this.vector + ", " + this.tuple + ")";
	}
}