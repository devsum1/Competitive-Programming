package test;
import java.util.*;

class League {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int T;
	T = s.nextInt();

	while(T-- >0) {
		int sum = 0;
		int a= s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if((a<2)&&(b<2)&&(c<2)) {
			if((a+b+c) <= 2) {
				   System.out.println("NO");
			   }else {
				    sum += a*1+b*2+c*3;
					System.out.println(sum%2 == 0?"YES":"NO");
			   }
		}else {
			sum += a*1+b*2+c*3;
			if((a==1 && b==0 && c %2 != 0)||(b==2 && a==0 && c %2 == 0)||(a==0 && c==0 && b %2 != 0)||(a == 0 && b==1 && c%2 == 0)) {
				   System.out.println("NO");
			   }
			else {
				System.out.println(sum%2 == 0?"YES":"NO");
			}
			
		}
	   
	}
	
	}

}
