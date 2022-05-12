class a10 extends Thread { 
	public void run() { 
	try{ 
		System.out.println("Thread no:"+Thread.currentThread().getId()+"is running"); 
	} catch(Exception e){
		System.out.println("Exception happend");
	}
} 
public static void main(String [] args){ 
		for(int i=1;i<=10;i++){
			a10 ob1=new a10();  
			ob1.start();  
		}
	} 
}