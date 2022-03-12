//import java.io.*;

class CmdLineArgs{
	public static void main(String args[]){
		System.out.println("After getting the inputs from command line :");
		//System.out.println();
		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				System.out.print(args[j]+" ");
			}
			System.out.println();
		}
	}	
}