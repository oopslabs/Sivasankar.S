package seriesexam;
import java.util.*;
class blwavg extends Exception{
	public blwavg(String s){
		super(s);
	}
}
public class percentage {
	int rollno;
	String name;
	int mark1,mark2,mark3;
	int percentage;
	percentage(int srollno,String sname,int smark1,int smark2,int smark3){
		rollno=srollno;
		name=sname;
		mark1=smark1;
		mark2=smark2;
		mark3=smark3;
	}
	void average(){
		percentage=((mark1+mark2+mark3)/3);
		
	}
	void display(){
		System.out.println("rollno	:"+rollno);
		System.out.println("name	:"+name);
		System.out.println("mark1	:"+mark1);
		System.out.println("mark2	:"+mark2);
		System.out.println("mark3	:"+mark3);
		System.out.println("percentage	:"+percentage);
		try{
			if(percentage<40){
				throw new blwavg("failed");
			}
		}
		catch(blwavg e){
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		percentage[] obj=new percentage[n];
		for(int i=0;i<n;i++){
			System.out.println("enter details of student "+(i+1));
			System.out.println();
			System.out.println("enter roll no");
			int a=sc.nextInt();
			System.out.println("enter name");
			String b=sc.nextLine();
			b=sc.nextLine();
			System.out.println("enter first mark");
			int c=sc.nextInt();
			System.out.println("enter second mark");
			int d=sc.nextInt();
			System.out.println("enter third mark");
			int e=sc.nextInt();
			obj[i]=new percentage(a,b,c,d,e);
			obj[i].average();
			
		}
		for(int i=0;i<n;i++){
			obj[i].display();
		}
		

	}

}
