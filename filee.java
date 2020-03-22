package test;
import java.util.*;
import java.util.Scanner.*;
import java.lang.*;
import java.io.*;

 class filee{
	 /* package codechef; // don't place package name! */
	 	public static void main (String[] args) throws java.lang.Exception
	 	{
	 		try{
	 		    int t;
	 		    Scanner scan = new Scanner(System.in);
	 		    t = scan.nextInt();
	 		    int a,b,c;
	 		    for(int i=0 ;i<t;i++){
	 		        a = scan.nextInt();
	     		    b = scan.nextInt();
	     		    c = scan.nextInt();
	     		    int sum = a*1 + b*2 + c*3;
	     		    if(sum % 2 !=0){
	     		        System.out.println("NO");
	     		    }
	     		    else{
	     		        if((a == 1 && c == 1 && b == 0) || (a == 0 && c == 0 && b%2 != 0) || (a == 0 && b==1 && c%2 == 0) || (a == 1 && b==0 && c%2 != 0)){
	     		            System.out.println("NO");
	     		        }
	     		        else{
	     		            System.out.println("YES");
	     		        }
	     		    }
	 		    }
	 		    
	 		}
	 		catch(Exception e){
	 		    return;
	 		}
	 	}
	 
	
}


