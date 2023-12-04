
public class UA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int x = Math.min(Math.min(a, b), c);
		int y = Math.max(Math.max(a, b), c);
		int mid = a+b+c-x-y;
		System.out.println(x+" "+mid+" "+y);
	}

}
