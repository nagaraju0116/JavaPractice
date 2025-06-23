package Collections;

public class MultiDimensionalArray {
//two Dimensional array
	public static void main(String a[]) {
		//[3] rows , [4] colums
		int nums[][]= new int[3][4];
		
		for (int i=0;i<3;i++) 
		{
			//inside rows
			for(int j=0;j<4;j++) {
				//" " used to give space for every number
				System.out.print(nums[i][j]+" ");
				/* to print not in line removed ln from println
				 * 0 0 0 0 
				 * 0 0 0 0 
			     * 0 0 0 0 	
				 * */
			}
			//once print 1 line in j to come aother line
			System.out.println();
		}
	}

}
