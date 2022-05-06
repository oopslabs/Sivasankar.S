package courseoutcome1;
import java.util.*;
class student{
	String name;
	student(String sname){
		name=sname;
	}
}
class sports extends student{
	String sport;
	String grade;
	static int j=1;
	sports(String sname,String ssports,String sgrade){
		super(sname);
		sport=ssports;
		grade=sgrade;
	}
}
public class Result extends sports {
	Result(String sname,String ssports,String sgrade){
		super(sname,ssports,sgrade);
	}
	void display() {
		System.out.print(j+"\t"+name+"\t"+sport+"\t");
		System.out.print(grade);
	}

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Result[] res=new Result[10];
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the name of the student ");
			String a=in.nextLine();
			a=in.nextLine();
			System.out.println("Enter the sport category of the student ");
			String b=in.nextLine();
			System.out.println("Enter the grade given to the student ");
			String c=in.nextLine();
			res[i]=new Result(a,b,c);
		}
		System.out.println("-------student  Details--------");
		System.out.println("NO	NAME	SPORT	GRADE");
		for(int i=1;i<=n;i++) {
			System.out.println();
			res[i].display();
			j++;
		}
		
		

	}

}

