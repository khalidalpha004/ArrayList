package ArrayList;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(1,20);
		arr.add(30);
//		set is replacing the integer
		arr.set(2,50);
		arr.remove(2);
		System.out.println(arr.size());
//		System.out.println(arr.get(2));
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("For each Loop");
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
