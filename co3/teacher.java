package siva;
import java.util.*;
class Employee{
	public int empid;
	public String name;
	public int salary;
	public String address;
	Employee(int emp,String empname,int empsalary,String empaddress){
		empid=emp;
		name=empname;
		salary=empsalary;
		address=empaddress;
	}
}
public class teacher extends Employee {
	String department;
	String subjects;

	teacher(int emp,String empname,int empsalary,String empaddress,String dep,String sub) {
		super(emp,empname,empsalary,empaddress);
		department=dep;
		subjects=sub;
		
	}
	void display() {
		System.out.println("teacher id		="+empid);
		System.out.println("teacher name		="+name);
		System.out.println("teacher salary		="+salary);
		System.out.println("teacher address		="+address);
		System.out.println("teacher department	="+department);
		System.out.println("teacher subject		="+subjects);
		
	}

	public static void main(String[] args) {
		teacher[] obj = new teacher[10];
        System.out.println("Enter the number of teacher : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter details of each teacher : ");

        for (int i = 1; i <= n; ++i) {

            
            System.out.println("enter details of teacher " + i);
            System.out.println("enter teacher number ");
            int u = input.nextInt();
            input.nextLine();
            System.out.println("enter teacher name ");
            String v = input.nextLine();
            input.nextLine();
            System.out.println("enter salary ");
            int w= input.nextInt();
            input.nextLine();
            System.out.println("enter address ");
            String x= input.nextLine();
            input.nextLine();
            System.out.println("enter department ");
            String y = input.nextLine();
            input.nextLine();
            System.out.println("enter subjects ");
            String z= input.nextLine();
            input.nextLine();
            obj[i]=new teacher(u,v,w,x,y,z);
            
        }
        System.out.println("-----------Teacher Details--------------");
        for (int i = 1; i <= n; ++i) {
        	obj[i].display();
        	
        }
	}

}
