
public class UA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int a = min + (int)((max - min +1) * Math.random());
		int b = min + (int)((max - min +1) * Math.random());
		System.out.println("a="+a);
		System.out.println("b="+b);
		int sum = a+b;
		System.out.println(sum);
	}

}
