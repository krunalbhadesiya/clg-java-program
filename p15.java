import java.util.*;

class overload{
	double l,w,h,a;
	overload(double x,double y,double z){
		l=x;
		w=y;
		h=z;
	}
	overload(double x){
		a=x;
	}
	void Rect_Volume(){
		double v=l*w*h;
		System.out.println("Ractangle Volume="+v);		
	}
	void Cube_Volume(){
		double v=a*a*a;
		System.out.println("Cube Volume="+v);
	}	
}

class p15 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Rectangle Langth:");
		double InpRectVolL = input.nextDouble();
		System.out.println("Enter Rectangle Width:");
		double InpRectVolW= input.nextDouble();
		System.out.println("Enter Rectangle Hight:");
		double InpRectVolH= input.nextDouble();

		System.out.println("Enter Cude Langth Or Width Or Hight:");
		double InpCubeVolLWH= input.nextDouble();

		overload od = new overload(InpRectVolL,InpRectVolW,InpRectVolH);
		od.Rect_Volume();
		overload od1 = new overload(InpCubeVolLWH);
		od1.Cube_Volume();
	}
}
