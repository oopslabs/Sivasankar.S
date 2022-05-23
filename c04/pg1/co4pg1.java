package siva;
import graphics.*;
import java.util.*;
public class co4pg1 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		circle cir=new circle();
		rectangle rec=new rectangle();
		triangle tri=new triangle();
		square squ=new square();
		int c;
		do {
			System.out.println("1.circle\n2.rectangle\n3.triangle\n4.square\n5.exit\nenter your choice");
			c=sca.nextInt();
			switch(c) {
			case 1:cir.area();
					break;
			case 2:rec.area();
					break;
			case 3:tri.area();
					break;
			case 4:squ.area();
					break;
			case 5:break;
			default:System.out.println("Invalid choice");
			}
		}while(c!=5);
	}

}
