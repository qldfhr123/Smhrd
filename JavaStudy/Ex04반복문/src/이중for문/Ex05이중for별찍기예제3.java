package 이중for문;

public class Ex05이중for별찍기예제3 {
	public static void main(String[] args) {
		
		/*피라미드 만들기*/    
		// i는 1부터 5까지 증가하며 각 행을 담당
		for(int i=1; i<=6; i++){
			//공백을 주기위해
		    for(int j=6-i; j>0; j--){
		        System.out.print(" ");
		    }
		    //양옆 공백 주고 별추가 (홀수개로 출력이 되어야 피라미드 형태 유지)
		    for(int j=1; j<=(i*2)-1; j++){
		        System.out.print("*");
		    }
		    // 한 행이 끝나면 줄바꿈
		    System.out.println();
		}

		/*리버스 피라미드 만들기*/
		for(int i=1; i<=6; i++){
		    for(int j=1; j < i; j++){
		        System.out.print(" ");
		    }
		    for(int j=(7-i)*2 -1; j>0; j--){//11개의 별을 찍기 위해
		        System.out.print("*");
		    }
		    // 한 행이 끝나면 줄바꿈
		    System.out.println();
		}
	
	}
}

