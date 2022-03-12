import java.io.*;

class AdditionWithBufferedReader{
	public static void main(String args[])throws Exception{
		System.out.println("\t***Addition With Buffered Reader***");
		System.out.println("Enter two No.s :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=a+b;
		System.out.println("The answer of the addition is : "+c);
	}	
}