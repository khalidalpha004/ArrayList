package ArrayList;

import java.util.ArrayList;

public class RemoveConsicativeElements {
    public static ArrayList<Integer> RemoveConsicative(int arr[]){
    	int n=arr.length;
    	 ArrayList<Integer> a=new ArrayList<>();
//    	 int j=0;
    	 a.add(arr[0]);
    	for(int i=1;i<n;i++) {
    		if(arr[i]!=arr[i-1]) {
    			
    			a.add( arr[i]);
    		}
    	}
    	
    		
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,1,2,2,3,3,3,34,5,5,5,88,88,6,6,6};
      ArrayList<Integer> a=RemoveConsicative(arr);
      for(int i=0;i<a.size();i++) {
    	  System.out.println(a.get(i));
      }
	}

}
