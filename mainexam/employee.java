package exam;
import java.util.*;
public class employee {
	int eno;
	String ename;
	int esalary;
	employee(int u,String v,int x){
		eno=u;
		ename=v;
		esalary=x;
	}
	void display(){
		System.out.println("employee number 	= "+eno);
		System.out.println("employee name	 	= "+ename);
		System.out.println("employee salary 	= "+esalary);
	}

	public static void main(String[] args) {
		int i=0;
		int ch;
		employee obj[]=new employee[10];
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1.enter employee\n2.display all\n3.search employee\n4.exit\nenter your choice");
		ch=sc.nextInt();
		switch(ch){
		case 1:	System.out.println("Details of employee "+(i+1));
				System.out.println("enter the employee number");
				int a=sc.nextInt();
				System.out.println("enter the employee name");
				String b=sc.nextLine();
				b=sc.nextLine();
				System.out.println("enter the employee Salary");
				int c=sc.nextInt();
				obj[i]=new employee(a,b,c);
				i++;
				System.out.println("");
				break;
		
		case 2:	for(int j=0;j<i;j++){
				System.out.println("__"+(j+1)+"__");
				obj[j].display();
				System.out.println("");
				System.out.println("");
				}
				break;
				
		case 3:System.out.println("Enter a employee number you want search");
				int d=sc.nextInt();
				int flag=0;
				for(int j=0;j<i;j++){
					if(obj[j].eno==d){
						obj[j].display();
						flag=1;
						System.out.println("");
						System.out.println("");
					}
				
				}
				if(flag==0){
			System.out.println("employee not found");
				}
				break;
		case 4:break;
		default:System.out.println("invalid choice");

			}
		}while(ch!=4);

	}
}
