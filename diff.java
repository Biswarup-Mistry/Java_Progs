import java.io.*;

class diff{
	public static void main(String args[])throws Exception{
		System.out.println("Enter String1 :"); 
		DataInputStream dis=new DataInputStream(System.in);
		String s1=dis.readLine();
		System.out.println("Enter String2 :"); 
		DataInputStream dis1=new DataInputStream(System.in);
		String s2=dis1.readLine();
		System.out.println(s1+s2);
	}
}