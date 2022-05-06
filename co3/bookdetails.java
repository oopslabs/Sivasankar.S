package courseoutcome1;
import java.util.*;
class books{
	String name;
	books(String bname){
		name=bname;
	}
}
class publications extends books{
	String publish;
	publications(String pname,String ppublish){
		super(pname);
		publish=ppublish;
	}
}
class genre extends publications{
	String category;
	genre(String gname,String gpublish,String gcategory){
		super(gname,gpublish);
		category=gcategory;
	}
	void display() {
		System.out.println("Book Name		="+name);
		System.out.println("Book publication	="+publish);
		System.out.println("Book genre		="+category);
	}
}
class fiction extends publications{
	String fic;
	fiction(String gname,String gpublish,String gcategory){
		super(gname,gpublish);
		fic=gcategory;
	}
	void display() {
		System.out.println("Book Name		="+name);
		System.out.println("Book publication	="+publish);
		System.out.println("Book genre		="+fic);
	}
}
public class bookdetails {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		genre[] gen=new genre[10];
		fiction[] fix=new fiction[10];
		System.out.println("enter number of books ");
		int n=in.nextInt();
		int x=0;
		int y=0;
		String z="fiction";
		System.out.println("**book details**");
		for(int i=1;i<=n;i++) {
			System.out.println("-"+i+"-");
			System.out.println("enter name of the book");
			String a=in.nextLine();
			a=in.nextLine();
			System.out.println("enter publishers name");
			String b=in.nextLine();
			System.out.println("enter the genre of the book");
			String c=in.nextLine();
			boolean w=c.equals(z);
			if(w==true) {
				fix[x]=new fiction(a,b,c);
				x++;
			}
			else {
				gen[y]=new genre(a,b,c);
				y++;
			}
		}
		for(int i=0;i<y;i++) {
			System.out.println("book details");
			System.out.println("__"+(i+1)+"__");
			gen[i].display();
			System.out.println();
			
		}
		for(int i=0;i<x;i++) {
			System.out.println("book details whose genre is fiction");
			System.out.println("__"+(i+1)+"__");
			fix[i].display();
			System.out.println();


		}
	}
		

}
