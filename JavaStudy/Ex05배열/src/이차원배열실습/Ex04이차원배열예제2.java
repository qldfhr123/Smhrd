package 이차원배열실습;

public class Ex04이차원배열예제2 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int num = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = num++; 
			}
		}
		System.out.println("원본:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		int[][] rotated = new int[5][5];
		for (int i = 0; i < rotated.length; i++) {
			for (int j = 0; j < rotated.length; j++) {
				rotated[4 - j][i] = array[i][j];
			}
		}
		System.out.println("\n90도 회전:");
		for (int i = 0; i < rotated.length; i++) {
			for (int j = 0; j < rotated.length; j++) {
				System.out.print(rotated[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
