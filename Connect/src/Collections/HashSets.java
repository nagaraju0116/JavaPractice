package Collections;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
	//	HashSet<E> extends AbstractSet<E> implements Set<E>
	//in hashset/set only unique values to  be mention
		HashSet<Integer> nums = new HashSet<>();
	
		
	nums.add(4);
	nums.add(65);
	nums.add(24);
	nums.add(4);
	
	//set won't follow any sequence
	/* output
	 * 65
	 * 4
	 * 24
	 *  */  
	
		for(int n: nums) {
			System.out.println(n);
		}
	}
}

/*
 * nums.add(4);
	nums.add(5);
	nums.add(2);
	nums.add(4);  
	
output be 

	2
	4
  	5
 * 
 * 
 * nums.add(4);
	nums.add(5);
	nums.add(6);
	nums.add(4);  
 * 
 * output be 
	
	4
  	5
  	6
 * 
 * list can have repeat values but not in set
 * */
