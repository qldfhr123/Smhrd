package 학생정보관리프로그램;

public class Student {
	
	// 1.Field
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	//생성자(constructor)
	// 객체를 생성하는 순간에 실행되는 메소드
	public Student(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
		
	}
	// 오버로딩
	public Student() {
		
	}

	// 2. Method
	// 외부 에서 가져갈수있는 메소드
	public String getName() {
		return name;
	}
	// 외부 에서 수정할수있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	

}
