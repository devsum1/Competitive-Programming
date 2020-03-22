package test;
import java.util.*;
class FireIce{
	public static int ans = 1;

	public static int checkpd(int r,int c){
		
		for(int i = 1;i<=r;i++){
			
		}
		return checkpd(r,c);
}
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int T = s.nextInt();
	while(T-- > 0){
		int r = s.nextInt();
		int c = s.nextInt();
 
      int q = checkpd(r,c);
      System.out.println(q==1?"Yes":"No");
	}
}
}