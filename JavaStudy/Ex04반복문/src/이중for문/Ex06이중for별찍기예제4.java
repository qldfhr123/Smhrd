package 이중for문;

public class Ex06이중for별찍기예제4 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i+=2){
            for(int j=10; j>i-1; j-=2){ //왼쪽 별찍는 기능 담당 10부터 2씩 감소 각행마다 더 줄어든다
                System.out.print("*");
            }
            for(int j=0; j<i; j++) { //중앙 공백을담당 
                System.out.print(" ");
            }
            for(int j=10; j>=i; j-=2){//오른쪽 별찍기 위와 동일
                System.out.print("*");
            }
            System.out.println();
        }
		//위에 피라미드와 다르게 한행 줄이고 시작하기때문에 위보다 하나씩 작게 작성
        for(int i=1; i<9; i+=2) {
            for(int j= -2; j<i; j+=2){
                System.out.print("*");
            }
            for(int j = 8; j > i; j--){
                System.out.print(" ");
            }
            for(int j = -2; j < i; j+=2){
                System.out.print("*");
            }
            System.out.println();
        }
	
	}
}

