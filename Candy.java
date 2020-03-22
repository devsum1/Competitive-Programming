package test;
import java.util.*;
public class Candy {
	public static void oechar(String a) {
		
		String odd="",even="";
		
		for(int i = 0;i<a.length();i++) {
			if(i % 2 != 0) odd+=a.charAt(i);
			else 	even+=a.charAt(i);
		}
		
		System.out.println("Character at even position");
		System.out.println(even);
		System.out.println("Character at odd position");
		System.out.println(odd);
		
	}
	public static void ccchar(String a) {
		
		HashMap<Character,Integer>h = new HashMap<>();
		for(int i = 0;i<a.length();i++) {
			
			if(h.containsKey(a.charAt(i))) {
				int k = h.get(a.charAt(i));	
				h.put(a.charAt(i),k+1);
			    	
			}else 
				h.put(a.charAt(i),1);
			
		}
		System.out.println(h);
	}
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
	
		String a = s.next();
		oechar(a);
		ccchar(a);
	}

}
