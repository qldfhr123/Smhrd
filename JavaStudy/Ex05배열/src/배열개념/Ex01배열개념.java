package 배열개념;

public class Ex01배열개념 {

	public static void main(String[] args) {
		//[case1]
		// 1-1 정수 3개를담는 배열 numList1
		int[] numList1 = new int[3];
		// 1-2 데이터 할당하기
		numList1[0] = 3;
		numList1[1] = 5;
		numList1[2] = 7;
		//numList1[3] = 9; 오류
		System.out.println(numList1[2]);
		
		//[case2]
		// 2-1 정수 3개를담는 배열 numList2
		int[] numList2 = {2,4,6};
		System.out.println(numList2[2]);
		
		//numList1 변경
		numList1[2] = 1;
		
		//배열은 인덱스 번호가 규직적이기 때문에 for문 사용하기 아주 적합한 구조
		//[예제] numList1 모든값 출력
		for(int i = 0; i < numList1.length; i++) {
			System.out.println(numList1[i]);
		}
		

		
	}

}
