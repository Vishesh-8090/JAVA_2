import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Degree in Fahrenheit : ");
		double far = sc.nextDouble();
		double cal;
		
		cal = (far-32) * (5.0/9);
		System.out.print("It's value in Celsius is : ");
		System.out.println(cal);
	}

}
