package test;
import java.util.*;
 class ChefSeq{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
	int t;
	ArrayList<Integer>rep = new ArrayList<Integer>();
	ArrayList<Integer>dup = new ArrayList<Integer>();
	
		int n = s.nextInt();
		int k = s.nextInt();
		int total = 0;
		int arr[] = new int[n];
	    
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
			rep.add(arr[i]);
		}
		ArrayList<Integer>elem = new ArrayList<Integer>(k);
		
		 Set<Integer> set = new HashSet<Integer>(rep);
		 
	       
	        for (Integer temp : set){
	        	dup.add(temp);
	        }
	        
		for(int i = 0;i<arr.length;i++) {
			if(!elem.contains(arr[i])) {
				elem.add(0,arr[i]);
				
			}
			if(elem.size()>k) {
				elem.remove(elem.size() - 1);
			}

	        if (elem.equals(dup)) 
	            break;
			 
		}
		System.out.println(elem.size());
		for(int i = 0;i<elem.size();i++) {
		System.out.print(elem.get(i)+" ");
		
		}
	

	}
};


