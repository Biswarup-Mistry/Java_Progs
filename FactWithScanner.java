import java.io.*;
import java.util.*;

class FactWithScanner{
	public static void main(String args[])throws Exception{
		System.out.println("\n\t***Factorial With Scanner***");
		System.out.println("Enter the No :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("The answer of the Factorial is : "+fact);
	}	
}