package for문;

public class Ex01for문기초 {

	public static void main(String[] args) {
		
		for(int i =0; i<5; i++){
			System.out.println(i);
		}
		//연습1

		for(int i = 96; i>=73; i--){
			System.out.print(i+" ");
		}
		System.out.println();
		//연습2

		for(int i = 96; i>=73; i--){
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
		    if(i % 2 == 0) {  
		        sum -= i;     
		        System.out.print("-"+i+" ");
		        
		    } else {         
		        sum += i;      
		        System.out.print(i);
		    }
		}
		System.out.println("");
		System.out.println("결과: " + sum);


	}

}
