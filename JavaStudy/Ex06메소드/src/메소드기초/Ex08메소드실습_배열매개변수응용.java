package 메소드기초;

public class Ex08메소드실습_배열매개변수응용 {

	public static void main(String[] args) {
		
		int array [] = {15,10,2,8,23};
		
		arrPrint(array);
	
	}

	public static void arrPrint(int [] a) {
		double avg=0;
		int sum=0;
	    for(int i = 0; i<a.length; i++) {
	    	sum += a[i];
	    	avg = (double)sum/a.length;
	    }
	    System.out.println("배열의 평균 : " +avg);
	 
	}

}
