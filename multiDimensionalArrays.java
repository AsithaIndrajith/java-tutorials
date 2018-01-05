package MT1;

public class multiDimensionalArrays {

	public static void main(String[] args) {
		int[][] twoDimensionalArray= {{1,2},{3}};//
		System.out.println("2d array's 0 th position array's 1 st element is: "+twoDimensionalArray[0][1]);//accessing 1st array's 0 th position array's 1 st element
		System.out.println("Accessing 2d Array");
		
		for(int i=0;i<twoDimensionalArray.length;i++) {//using array.length property
			for(int j=0;j<twoDimensionalArray[i].length;j++) {
				System.out.println(twoDimensionalArray[i][j]);
				}
		}
	}

}
