package 배열실습;

import java.util.Arrays;

public class Ex01배열실습_가장큰수 {

	public static void main(String[] args) {
	
		int[] array = {6,3,8,4,2};
		int max = 0;

		System.out.print("array에 들어있는  값은 입니다");
		System.out.print(Arrays.toString(array));
		
		for(int i = 0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];	
			}
		}
		System.out.println("");
		System.out.println("가장 큰 값은 "+max+"입니다");
	}

}
