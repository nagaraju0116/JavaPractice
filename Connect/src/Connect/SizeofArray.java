package Connect;

public class SizeofArray {

	public static void main(String[] args) {
		//columns we don't know how many
		int nums[][]= new int [3][];  //jagged array --to find the size of array
		
		//this is for size of array
		nums[0] = new int[3];		
		nums[1] = new int[4];		
		nums[2] = new int[2];		
		
		//nums.length used to get size fro unkown values
		for (int i=0;i<nums.length;i++) 
		{
			
			for(int j=0;j<nums[i].length;j++) {
				
				nums[i][j]= (int)(Math.random()*10);
				
			}
			
		}
			
		//enhanced for loop
		//n is an array so n[]
		for(int n[]:nums) {
			
			for(int m:n) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

}
