package 이중for문;

public class z_money_count {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 77, j = 1; i >= 1; i--, j++) {
		    sum = sum + (i * j);
		    System.out.print(i+" "+j);
		}
		System.out.println();
		System.out.println(sum);
	}

}
