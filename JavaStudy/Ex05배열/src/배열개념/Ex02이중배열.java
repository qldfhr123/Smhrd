package 배열개념;

public class Ex02이중배열 {

	public static void main(String[] args) {
		
		// 1. 배열 생성
		int [][] array = new int[3][4];
		// 2. 배열에 값 할당
//		array [0][0] = 1;		
		int[][] array2 = {
				{1,2,3,4}, //0행
				{5,6,7,8},//1행
				{9,10,11,12},//2행
		};
		System.out.println(array2[1][2]);
		System.out.println(array2[1]); // 정확히 행과열으르 지정해야한다
		
		System.out.println(array2[0][3]);
		System.out.println(array2[1][3]);
		System.out.println(array2[2][3]);
		
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[0][2]);
		System.out.println(array2[0][3]);
		 
		
	}

}
