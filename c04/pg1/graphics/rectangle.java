package graphics;
import java.util.*;
public class rectangle {
	Scanner in= new Scanner(System.in);
	
	public void area() {
		System.out.println("enter the length");
		int l=in.nextInt();
		System.out.println("enter the breadth");
		int b=in.nextInt();
		System.out.println("area of the rectangle is :"+(l*b));
		
	}

}