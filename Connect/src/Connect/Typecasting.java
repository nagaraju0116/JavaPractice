package Connect;

public class Typecasting {

	public static void main(String[] args) {
		int nums[][]= new int [3][4];
		//math class in java which give random values and random() is a double type method
		
				
		
		
		for (int i=0;i<3;i++) 
		{
			
			for(int j=0;j<4;j++) {
				//so random() is double to convert it into int added type casting as int 
				//multiply by 10 so double become int and bracket should be over math class
				
				//type casting
				nums[i][j]= (int)(Math.random()*10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
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
