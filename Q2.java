import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in Km : ");
		double km = 0, m, feet, inc, cm;
		
		m = km*1000;
		feet = km*3280.8399;
		inc = km*39370.0787;
		cm = km*100000;
		
		System.out.println(km+" km is "+m+" meters");
		System.out.println(km+" km is "+feet+" feets");
		System.out.println(km+" km is "+inc+" inches");
		System.out.println(km+" km is "+cm+" centimeters");
		
		
	}

}
