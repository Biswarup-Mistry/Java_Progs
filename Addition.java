import java.io.*;

class Addition{
	public static void main(String args[]) throws Exception{
		System.out.println("\n\t***Addition***\nEnter the 1st No. :\n");
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s1=br.readLine();
		System.out.println("\nEnter the 2st No. :\n");
		//InputStreamReader isr= new InputStreamReader(System.in);
		//BufferedReader br1=new BufferedReader(isr);
		String s2=br.readLine();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;
		System.out.println("\nAns : "+c+"\n");		
	}	
}