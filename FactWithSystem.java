import java.io.*;
import java.util.*;
import java.math.*;

class FactWithSystem{
	public static void main(String args[])throws Exception{
		System.out.println("\n\t***Factorial With Scanner***");
		System.out.println("Enter the No :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger fact =new BigIntegerMath.factorial(n);
		//int fact=factorial(n);
		System.out.println("The answer of the Factorial is : "+fact);
	}	
}