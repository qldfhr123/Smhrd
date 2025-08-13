package 이중for문;

import java.util.Scanner;
import java.time.LocalDate;
//날짜 차이계산
import java.time.Period;

public class z_age_Count {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("출생 연도를 입력하세요: ");
		int birthYear = sc.nextInt();

		System.out.print("출생 월을 입력하세요: ");
		int birthMonth = sc.nextInt();

		System.out.print("출생 일을 입력하세요: ");
		int birthDay = sc.nextInt();

		// 나이 계산
		int age = 2025 - birthYear;

		// 생일이 지났는지 확인
		if (birthMonth > 3 || (birthMonth == 3 && birthDay > 6)) {
			// 하나 나이 뺴주기
			age--;
		}
		System.out.println("만 " + age + "세입니다.");
//		int age =0;
//		// 현재 날짜 기준
//		LocalDate today = LocalDate.now();
//
//		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
//		// 입력된 날짜와 현재 날짜를 계산하는 함수
//		Period age = Period.between(birthDate, today);
//
//		System.out.println("만 " + age.getYears() + "세입니다.");

	}

}
