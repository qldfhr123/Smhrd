package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		stu1.setName("이도연");
		stu1.setNumber("20241111");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		
		// 이름, 자바 점수 출력	
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());

		Student stu2 = new Student("신재영","20252222",19);
		System.out.println(stu2.getName());
		// new Student(); >>>>>>> 객체를 생성하는 순간에 실행되는 매소드
		
		
	}

}
