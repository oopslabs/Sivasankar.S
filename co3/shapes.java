package siva;

public class shapes {
	void Area(int a) {
		System.out.println("The area of the square is "+a*a);
	}
	void Area(double a) {
		double A;
		A=3.14*a*a;
		System.out.println("The area of the circle is "+A);
	}
	void Area(int a,int b) {
		System.out.println("The area of the square is "+a*b);
	}

	public static void main(String[] args) {
		shapes obj=new shapes();
		obj.Area(5);
		obj.Area(5.67);
		obj.Area(10, 7);

	}

}
