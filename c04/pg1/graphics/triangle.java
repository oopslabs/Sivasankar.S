package graphics;
import java.util.*;
public class triangle {
	Scanner in= new Scanner(System.in);
	
	public void area() {
		System.out.println("enter the height");
		int h=in.nextInt();
		System.out.println("enter the breadth");
		int b=in.nextInt();
		System.out.println("area of the triangle is :"+((h*b)/2));
		
	}

}