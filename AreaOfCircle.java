class overload {
	final double pi = 3.14;

	void area(double r){
		double area=pi*r;
		System.out.println("Your Circle Radias="+r+"and Area Of Circle ="+area);
	}

	void area(double l,double b){
		double area=l*b;
		System.out.println("Your Rectangle Langth="+l+"and Width="+b+"and Area Of Rectangle ="+area);
	}

        void area(double l,double b,String tr){
		double area=(l*b)/2;
		System.out.println("Your Rectangle Langth="+l+"and Width="+b+"and Area Of Rectangle ="+area);
	}
}

class AreaOfCircle {
	public static void main(String args[]){
		overload od = new overload();
		od.area(15);
		od.area(10,20);
		od.area(10,30,"Triangle");
	}
}