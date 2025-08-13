package 이중for문;

public class Ex04이중for역별찍기2 {
	public static void main(String[] args) {

		for(int i = 1; i<6; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("");
			
		}

		for(int i = 6; i>1; i--){
		    for(int j = 2; j<=i; j++){
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		
		
		
	}
}

