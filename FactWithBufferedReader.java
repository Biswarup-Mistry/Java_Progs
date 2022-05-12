import java.io.*;

class FactWithBufferedReader{
	public static void main(String args[])throws Exception{
		System.out.println("\n\t***Factorial With Buffered Reader***");
		System.out.println("Enter the No :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("The answer of the Factorial is : "+fact);
	}	
}