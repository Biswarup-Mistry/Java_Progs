import java.io.*;

class factorialWithDIS{
	public static void main(String args[])throws Exception{
		System.out.println("\n\t***Factorial With DataInputStream***");
		System.out.println("Enter the No :");
		DataInputStream dis=new DataInputStream(System.in);
		int n=Integer.parseInt(dis.readLine());
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("The answer of the factorial is : "+fact);
	}	
}