package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		
		ArrayList<Student> sList = new ArrayList<Student>(); 
		
		Student stud = new Student("이름", 20);
		sList.add(stud);
		
		System.out.println(sList.get(0).getName());
		
		ArrayList<Student> tList = new ArrayList<Student>();
		Student teamate1 = new Student("이름", 20);
		Student teamate2 = new Student("이름", 20);
		Student teamate3 = new Student("이름", 20);
		Student teamate4 = new Student("이름", 20);
		Student teamate5 = new Student("이름", 20);
		
		sList.add(teamate1);
		sList.add(teamate2);
		sList.add(teamate3);
		sList.add(teamate4);
		sList.add(teamate5);
		
		for(Student mate_Num : tList) {
			System.out.println(mate_Num.getName() +"\t"+mate_Num.getAge());		
		}
	
	}
 
}

