package in.co.rays.array;

public class TestTwoDimentional {  // 2D array
	
	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];
		
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = 0; j < arr.length; j++) {
			
				
				arr[i][j] = (i + 1)*(j + 1);
				
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
			System.out.println();
		}
		
	}

}
