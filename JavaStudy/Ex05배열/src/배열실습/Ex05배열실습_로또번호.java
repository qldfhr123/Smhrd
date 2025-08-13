package 배열실습;

import java.util.ArrayList;
import java.util.Random;

public class Ex05배열실습_로또번호 {

	public static void main(String[] args) {
		 // 5개의 정수를 저장할 배열 선언
        int[] array = new int[5];
        Random random = new Random();
        // 배열에 랜덤값 넣기 (1~10)
        for(int i = 0; i < array.length; i++) {
            while(true) {
                // 1~10 사이의 랜덤값 생성
                int randomNum = random.nextInt(10) + 1;
                // 중복 검사
                boolean isDuplic = false;
                for(int j = 0; j < i; j++) {
                    if(array[j] == randomNum) {
                    	isDuplic = true;
                        break;
                    }
                }
                // 중복이 아니면 배열에 저장하고 다음 인덱스로
                if(!isDuplic) {
                    array[i] = randomNum;
                    break;
                }
            }
        }
        // 3. 결과 출력
        System.out.print("이번주 추첨번호는~~ ");
        for(int num : array) {
            System.out.print(num + " ");
        }
		

	}

}
