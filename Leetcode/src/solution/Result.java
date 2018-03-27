package solution;

public class Result {
	int target;
	StringBuilder path;
	
	public Result(int target) {
		this.target = target;
		this.path = new StringBuilder();
	}
	
	public void add(int num) {
		this.target -= num;
		if (this.path.length() > 0) this.path.insert(0, ", ");
		this.path.insert(0, num);
		if (this.target == 0) System.out.println(this.path.toString());
	}
	
	@Override
	public String toString() {
		return this.path.toString();
	}
}
