class factWithConsole{
	public static void main(String args[]){
		System.out.println("\n\t***Factorial With Console***");
		int n=Integer.parseInt(args[0]);
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("The answer of the Factorial is : "+fact);
	}	
}
