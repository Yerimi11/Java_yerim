package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
		
//		int[][] arr = {{2,4,6}, {1,2,3,5}};
		int[][] arr = new int[3][4];
		
		int i, j;
		
		for(i = 0; i<arr.length; i++) {
			for (j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");
			}
//			System.out.println("");
			System.out.println("\t -> " + arr[i].length); // \t = 탭(들여쓰기)
		}

	}

}
