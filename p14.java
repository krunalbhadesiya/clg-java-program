import java.util.*;

class overload {
	final double pi = 3.14;

	void area(double r){
		double area=pi*r;
		System.out.println("Your Circle Radius="+r+"and Area Of Circle ="+area);
	}

	void area(double l,double b){
		double area=l*b;
		System.out.println("Your Rectangle Length="+l+"and Width="+b+"and Area Of Rectangle ="+area);
	}

    //void area(double l,double b,String tr){
	//	double area=(l*b)/2;
	//	System.out.println("Your Rectangle Langth="+l+"and Width="+b+"and Area Of Rectangle ="+area);
	//}
}

class p14 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Circle Radias:");
		double InpCirRad = input.nextDouble();
		System.out.println("Rectangle Langth:");
		double InpRectL = input.nextDouble();
		System.out.println("Rectangle Width:");
		double InpRectW = input.nextDouble();

		overload od = new overload();
		od.area(InpCirRad);
		od.area(InpRectL,InpRectW);
		//od.area(10,30,"Triangle");
	}
}