class Parent{
	int n,fact=1;
	void factorial(int num){
		n=num;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("\nIn Parent Class, Factorial of "+n+" is : "+fact);
	}
}
class Child extends Parent{
	int a;
	Child(int num){
		a=num;
	}	
	void doing(){
		factorial(a);
	}
}
class a8{
	public static void main(String args[]){
		int f=1;
		Child c=new Child(6);
		c.doing();
	}
}