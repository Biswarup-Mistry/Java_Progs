class Figure{
	double surface(int r){
		return (6*r*r);
	}
	double surface(int r,int h,double pi){
		return (2*pi*r*(r+h));
	}
	double surface(int r,double pi){
		return (4*pi*r*r);
	}
}

class a7{
	public static void main(String args[]){
		double pi=3.1415926536;
		Figure cube=new Figure();
		Figure cylinder=new Figure();
		Figure sphere=new Figure();
		System.out.println("\nSurface area of Cube (r=4 unit): "+cube.surface(4)+" unit");
		System.out.println("Surface area of Cylinder (r=4 unit,h=6 unit): "+cube.surface(4,6,pi)+" unit");
		System.out.println("Surface area of Sphere (r=4 unit): "+cube.surface(4,pi)+" unit");
	}
}