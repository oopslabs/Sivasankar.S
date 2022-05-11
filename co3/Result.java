
import java.util.*;
interface student{
	String name="shibili";
	int mark1=100;
	
}
interface sports{
	int sportm=101;
	String sport="football";
	
	
}
public class Result implements student,sports{
	
	void display() {
		System.out.print(" name: "+name+"\n acadamic mark: "+mark1+"\n sport :"+sport+"\n sport mark :"+sportm);
		
	}

	public static void main(String args[]) {
		
		Result res=new Result();
		
		System.out.println("-------student  Details--------");
		res.display();
		
		

	}

}
