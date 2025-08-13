package 이차원배열실습;

public class Ex01기초예제 {

	public static void main(String[] args) {

		int[][] array = {
				{1,2,3,4}, //0행
				{5,6,7,8},//1행
				{9,10,11,12},//2행
		};
		
		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[0][2]);
		System.out.println(array[0][3]);
		
			for(int i = 0; i< array[0].length; i++) {
					System.out.println(array[0][i]);
			}
			
			//5 6 7 8
			for(int i = 0; i< array[1].length; i++) {
				System.out.print(array[1][i]+" ");
			}
			System.out.println();
			//9 10 1 12
			for(int i = 0; i< array[2].length; i++) {
				System.out.print(array[2][i]+" ");
			}
			System.out.println();
			for(int i = 0; i< array.length; i++) {
				for(int j = 0; j< array[i].length; j++) {
					System.out.println(array[i][j]);
				}
			}
			
			
	}

}
