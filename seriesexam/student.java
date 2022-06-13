package seriesexam;
import java.util.*;
public class student {
	int student_id;
	String name;
	String branch;
	student(int sstudent_id,String sname,String sbranch){
		student_id=sstudent_id;
		name=sname;
		branch=sbranch;
	}
	void display(){
		System.out.println("Student_id	:"+student_id);
		System.out.println("name		:"+name);
		System.out.println("branch		:"+branch);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of student");
		int n=sc.nextInt();
		student[] obj=new student[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the details of student " +(i+1));
			System.out.println("enter the id of student");
			int a=sc.nextInt();
			System.out.println("enter the name of student");
			String b=sc.nextLine();
			b=sc.nextLine();
			System.out.println("enter the branch of student");
			String c=sc.nextLine();
			obj[i]=new student(a,b,c);
		}
		System.out.println("------- student details-------");
		for(int i=0;i<n;i++){
			obj[i].display();
		}
	}

}
