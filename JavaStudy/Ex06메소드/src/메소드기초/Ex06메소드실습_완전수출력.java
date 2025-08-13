package 메소드기초;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06메소드실습_완전수출력 {

	public static void main(String[] args) {
		
		int startValue = 2;
		int endValue = 1000;
		String perfetcN = getPerfectNumber(startValue,endValue);
		System.out.println(startValue+"~"+endValue+ "까지의 완전수 : " +perfetcN);
	}

	public static String getPerfectNumber(int a, int b) {
		ArrayList<Integer> perfectNumbers = new ArrayList<>();
	    
	    for(int i = a; i <= b; i++) {
	        int sum = 0;
	        for(int j = 1; j < i; j++) {
	            if(i % j == 0) {
	                sum += j;
	            }
	        }
	        if(sum == i) {
	            perfectNumbers.add(i);
	        }
	    }
	    return perfectNumbers.toString();
	}

}
