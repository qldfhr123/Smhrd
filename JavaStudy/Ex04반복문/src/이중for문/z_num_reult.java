package 이중for문;

import java.util.Scanner;

public class z_num_reult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int intput_Money = sc.nextInt();
		
		int money_milm = 10000;
		int money_F_thun = 5000;
		int money_O_thun = 1000;
		int money_F_hand = 500;
		int money_O_hand = 100;
		
		int total_Money = 0;

		total_Money = intput_Money / money_milm;
		intput_Money = intput_Money % money_milm;
		System.out.println(money_milm+"원 "+total_Money+"개");
		
		total_Money = intput_Money / money_F_thun;
		intput_Money = intput_Money % money_F_thun;
		System.out.println(money_F_thun+"원 "+total_Money+"개");
		
		total_Money = intput_Money / money_O_thun;
		intput_Money = intput_Money % money_O_thun;
		System.out.println(money_O_thun+"원 "+total_Money+"개");
		
		total_Money = intput_Money / money_F_hand;
		intput_Money = intput_Money % money_F_hand;
		System.out.println(money_F_hand+"원 "+total_Money+"개");
		
		total_Money = intput_Money / money_O_hand;
		intput_Money = intput_Money % money_O_hand;
		System.out.println(money_O_hand+"원 "+total_Money+"개");
	    
		

	}

}
