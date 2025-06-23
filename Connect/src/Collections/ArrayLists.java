package Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		//ArrayList gets yellow line because in Array we mention type of elements 
		//need to mention elements type if not gets error
		//ArrayList<Integer> nums = new ArrayList<>();
		
		//ArrayList is a (interface)implements of  List
		List<Integer> nums = new ArrayList<>();
		
		//add method
		nums.add(4);
		nums.add(5);
		nums.add(9);
		nums.add(1);
		
		//enhanced for loop
		for(int n: nums) {
			System.out.println(n);
		}
						//get method
		//System.out.println(nums.get(2));
		
		//System.out.println(nums);
	}

}
/*
* Array is expandable, shrinkable  and its dynamic
*
*
*/