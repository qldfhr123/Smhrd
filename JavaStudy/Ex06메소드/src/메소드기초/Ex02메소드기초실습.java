package 메소드기초;

public class Ex02메소드기초실습 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		cal(num1,num2,op);
		System.out.println(cal(num1,num2,op));
	}

	public static int cal(int a, int b, char op) {
		int restult = 0;
		if(op=='-') {
			restult = (a-b); 
		}if(op=='+'){
			restult = (a+b); 
		}if(op=='*'){
			restult = (a*b); 
		}
		
		return restult;
	}

	
	
}
