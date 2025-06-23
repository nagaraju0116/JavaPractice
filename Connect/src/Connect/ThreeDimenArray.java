package Connect;

public class ThreeDimenArray {

	public static void main(String[] args) {
		 int num[][][] =new int[3][4][5];
		 
		 for(int i=0;i<3;i++) {
			 
			 for(int j=0;j<4;j++) {
				 for(int k=0;k<5;k++) {
					 num[i][j][k]=(int)(Math.random()*10);
					 
					 System.out.print(num[i][j][k]+" ");
				 }
				 System.out.println();
			 }
			 System.out.println();
		 }

			
			/*  any for- loop can use
			 * for(int l[][]:num) {
			 * 
			 * for(int[] n:l) {
			 * 
			 * 
			 * for(int m:n)
			 *  { 
			 * System.out.print(m+" ");
			 *  } 
			 *  System.out.println(); 
			 *  }
			 * System.out.println();
			 * 
			 * }
			 */
	}

}
