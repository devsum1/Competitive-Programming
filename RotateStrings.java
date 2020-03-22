package test;

import java.util.Scanner;

public class RotateStrings {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  
		  String ans="11";
		  String res ="";
		  int repeat=1;
		  
		  for(int i = 0;i<ans.length()-1;i++){
              if(ans.charAt(i) == ans.charAt(i+1))
                  repeat+=1;
             else{
                  res+=repeat+""+ans.charAt(i);
                  repeat = 1;
             }
          }
		  res+=repeat+""+ans.charAt(ans.length()-1);
		  System.out.println(ans+" "+res);
		  
	}

}
