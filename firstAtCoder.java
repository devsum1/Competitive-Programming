package test;
import java.util.*;

public class firstAtCoder {

	public static void main(String[] args) {

		   Scanner s = new Scanner(System.in);
		   int t = s.nextInt();
		   s.nextLine();
		   while(t-- > 0) {
		    int m = s.nextInt();
		    
		    int n = s.nextInt();
		    Boolean ans = false;
		    
		    int arr1[] = new int[m];
		    ArrayList<Integer> arr2= new ArrayList<Integer>();
		    
		    for(int i =0;i<m;i++)
		     arr1[i] = s.nextInt();
		    
		    for(int i =0;i<n;i++)
		     arr2.add(s.nextInt());
		     
		     HashMap <Integer,Integer> hash= new HashMap<Integer,Integer>();
		     
		     for(int i = 0;i<m;i++){
		         if(arr2.contains(arr1[i]))
		             hash.put(arr1[i],i);
		         
		         if(hash.keySet().size() == n){
		             ans = true;
		             break;
		         }
		     }
		    System.out.println(ans?"Yes":"No");
		    
	}

}
}