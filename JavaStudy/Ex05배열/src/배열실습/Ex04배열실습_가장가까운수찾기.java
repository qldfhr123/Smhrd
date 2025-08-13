package 배열실습;

import java.util.Arrays;

public class Ex04배열실습_가장가까운수찾기 {

	public static void main(String[] args) {

		int [] point = {92,32,52,9,81,2,68};
		int[] result = new int[2];	
	    int minDiff = 100;
	
	        // 모든 가능한 숫자 쌍을 비교
	        for(int i = 0; i < point.length - 1; i++) {
	            for(int j = i + 1; j < point.length; j++) {
	            	//절대값으로 구분해야한다 앞뒤의 크기가 다르기때문에 음수 양수 구분 을 위해 함수 사용
	                int diff = Math.abs(point[i] - point[j]);
	                //차이 조건
	                if(diff < minDiff) {
	                    minDiff = diff;
	                    result[0] = i;  // 첫번째 인덱스
	                    result[1] = j;  // 두번째 인덱스
	                }
	            }
	            
	        }
	        System.out.print("결과 : "+Arrays.toString(result));
	}

}


