package 이중for문;


public class Ex04이중for역별찍기예제3오른쪽정렬 {
	public static void main(String[] args) {
	
		
		for(int i = 1; i<=6; i++) {
		    // 공백 출력
		    for(int j = 6; j > i; j--) {
		        System.out.print(" ");
		    }
		    // 별 출력
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

	}
}

