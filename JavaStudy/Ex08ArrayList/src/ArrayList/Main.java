package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//크기가 가변적인 배열과 같은 형태를 가진 클래스

		ArrayList<String> list = new ArrayList<String>(); 
		
		list.add("이");
		list.add("주");
		list.add("신");
		
		System.out.println(list.get(0));

		// 특정위치 추가
		list.add(2, "임승환"); // 자리가 밀린다
		System.out.println(list.get(2));
		
		//데이터 삭제
		list.remove(2); //뒤로간 데이터는 복사되어서 들어간다
		
		//데이터 크기 알아보자
		System.out.println(list.size());
		
		//데이터 전체 삭제
		list.clear();
		
	}

}
