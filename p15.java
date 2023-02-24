class overload{
	double l,w,h,a;
	overload(){
		l=10;
		w=20;
		h=30;
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
		overload od = new overload();
		od.Rect_Volume();
		overload od1 = new overload(25.3);
		od1. Cube_Volume();
	}
}
