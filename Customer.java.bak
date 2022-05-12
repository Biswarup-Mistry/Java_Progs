import java.io.*;
import java.util.*;

class Info{
	int accno;
	String name;
	double bal;
	
	Info(String n,int acc, double b){
		name=n;
		accno=acc;
		bal=b;
	}
	void show(){
		
		if(bal<1000){
			System.out.println("-----------------------------------------------------------");
			System.out.println("Name : "+name+"\nAccount No. : "+accno+"\nBalance : "+bal+" /-");
			System.out.println("-----------------------------------------------------------");
		}		
	}	
}

class Customer{
	public static void main(String args[])throws Exception{
		System.out.println("How many Customers are there ? ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Info current[]=new Info[10];
		for(int i=0;i<n;i++){
			System.out.println("Enter customer name :");
			Scanner sc1=new Scanner(System.in);
			String s1=sc1.nextLine();
			System.out.println("Enter customer account no. :");
			Scanner sc2=new Scanner(System.in);
			int acc=sc2.nextInt();
			System.out.println("Enter customer Balance :");
			Scanner sc3=new Scanner(System.in);
			double bal=sc3.nextDouble();
			current[i]=new Info(s1,acc,bal);
		}
		System.out.println("\n\tCustomer Details with balance less than 1000.0 /- :");
		try{
		for(int i=0;i<n;i++){
			current[i].show();
		}
		}catch(Exception e){}		
	}
}