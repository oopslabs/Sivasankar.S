package courseoutcome1;
import java.util.*;
class people{
	String name;
	String gender;
	String address;
	int age;
	people(String pname,String pgender,String paddress,int page){
		name=pname;
		gender=pgender;
		address=paddress;
		age=page;
	}
}
class employee extends people{
	int empid;
	String companyname;
	String qualification;
	int salary;
	employee(String pname,String pgender,String paddress,int page,int eempid,String ecompanyname,String equalification,int esalary){
		super(pname,pgender,paddress,page);
		empid=eempid;
		companyname=ecompanyname;
		qualification=equalification;
		salary=esalary;
	}
}
public class teacher2 extends employee {
	String subject;
	String department;
	int teacherid;
	teacher2(String pname,String pgender,String paddress,int page,int eempid,String ecompanyname,String equalification,int esalary,String tsubject,String tdepartment,int tteacherid){
		super(pname,pgender,paddress,page,eempid,ecompanyname,equalification,esalary);
		subject=tsubject;
		department=tdepartment;
		teacherid=tteacherid;
	}
	void display() {
		System.out.println("Name			:"+name);
		System.out.println("Gender			:"+gender);
		System.out.println("Address			:"+address);
		System.out.println("Age			:"+age);
		System.out.println("Empid			:"+empid);
		System.out.println("Company Name		:"+companyname);
		System.out.println("Qualification		:"+qualification);
		System.out.println("Salary			:"+salary);
		System.out.println("Subject			:"+subject);
		System.out.println("Department		:"+department);
		System.out.println("Teacher Id		:"+teacherid);
		
	}

	public static void main(String[] args) {
		int i;
		teacher2[] obj=new teacher2[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of teacher details you want to enter");
		int n=in.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Enter the name of the teacher "+i);
			String a=in.nextLine();
			a=in.nextLine();
			System.out.println("Enter the gender of the teacher "+a);
			String b=in.nextLine();
			System.out.println("Enter the address of the teacher "+a);
			String c=in.nextLine();
			System.out.println("Enter the age of the teacher "+a);
			int d=in.nextInt();
			System.out.println("Enter the employee id of the teacher "+a);
			int e=in.nextInt();
			System.out.println("Enter the company name of the teacher "+a);
			String f=in.nextLine();
			f=in.nextLine();
			System.out.println("Enter the qualification of the teacher "+a);
			String g=in.nextLine();
			System.out.println("Enter the salary of the teacher "+a);
			int h=in.nextInt();
			System.out.println("Enter the subject of the teacher "+a);
			String j=in.nextLine();
			j=in.nextLine();
			System.out.println("Enter the department of the teacher "+a);
			String k=in.nextLine();
			System.out.println("Enter the teacher id of the teacher "+a);
			int l=in.nextInt();
			obj[i]=new teacher2(a,b,c,d,e,f,g,h,j,k,l);
		}
		for(i=1;i<=n;i++) {
			System.out.println("-------Teacher Details--------");
			System.out.println();
			System.out.println("**"+i+"**");
			System.out.println();
			obj[i].display();
			
			
		}

	}

}
