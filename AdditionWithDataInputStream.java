import java.io.*;

class AdditionWithDataInputStream{
	public static void main(String args[])throws Exception{
		System.out.println("\t***Addition With DataInputStream***");
		System.out.println("Enter two No.s :");
		DataInputStream dis=new DataInputStream(System.in);
		int a=Integer.parseInt(dis.readLine());
		int b=Integer.parseInt(dis.readLine());
		int c=a+b;
		System.out.println("The answer of the addition is : "+c);
	}	
}