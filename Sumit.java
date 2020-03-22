package test;


public class Sumit extends Thread{  
	
public void run(){  

	System.out.println("Now thread is running By me");  

for(int i = 0;i<= 10;i++) {
	  
	   try{
		   Thread.sleep(1000);
		  }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   } 
	   
	   System.out.println(i);
    System.out.println("hello world");
	}
}

public static void main(String args[]){  
	Sumit s1 = new Sumit();	
s1.start();  
 }  
}  