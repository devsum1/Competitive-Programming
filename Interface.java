package test;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Interface
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0)
		{
		    int a,b,c,r=0;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    if((a*1+b*2+c*3)%2!=0)
		    {
		    System.out.print("NO");
		    continue;
		    }
		    if(a%2==0&&b%2==0&&c%2==0)
		    {
		        System.out.print("YES");
		        continue;
		    }
		    if(a%2!=0)
		    r+=1;
		    if(b%2!=0)
		    r+=2;
		    if(c%2!=0)
		    r+=3;
		    
		    if(r==2)
		    {
		        if(a>=2||(b>=2&&c>=2))
		    System.out.print("YES");
		    else 
		    System.out.print("NO");
		    }
		   if(r==4)
		   	{
		   		if(a>=3||b>=2||(a>=2&&c>=2)||(b>=2&&c>=2))
		    System.out.print("YES");
		     else 
		    System.out.print("NO");
	}
		     if(r==6)
		    System.out.print("YES");

		}
	}
}
