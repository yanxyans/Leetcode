package solution;

public class Test {

	public static void main(String[] args) {
		
		String[] data = new String[] {"5","2","C","D","+"};
		BaseballGame test = new BaseballGame();
		int ret = test.calPoints(data);
		System.out.println(ret);
	}

}
