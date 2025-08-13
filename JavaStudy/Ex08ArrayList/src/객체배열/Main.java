package 객체배열;


public class Main {

	public static void main(String[] args) {
		
		//자로형[] 배열이름 = new 자료형[칸수]
		//포켓몬 자료형 3개 보관할 수 있는 bag 배열생성
		
		Pokemon[] bag = new Pokemon[3];
		
		//이름 : 피카츄 / 타입 : 전기 / 스킬: 백만볼트 / hp : 100 / atk : 10
		bag[0] = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		System.out.println(bag[0]);
		System.out.println(bag[0].getName());
		
		bag[1] = new Pokemon("잠만보", "노멀", "누르기", 200, 5);
		
		bag[2] = new Pokemon("망나뇽", "드래곤", "공중날기", 150, 15);
		
		
		System.out.println("==정보 출력==");
		System.out.println("이름 \t타입 \thp");
		for(int i = 0;  i< bag.length; i++) {
			System.out.println(bag[i].getName() +"\t"+ bag[i].getType() +"\t"+ bag[i].getHp()+"\t");			
		}
	
		//for - each문
		for(Pokemon p : bag ) {
			System.out.println(p.getName() +"\t"+ p.getType() +"\t"+ p.getHp()+"\t");
		}

	}

}
