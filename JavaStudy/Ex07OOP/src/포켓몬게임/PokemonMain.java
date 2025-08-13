package 포켓몬게임;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 포켓몬 두마리 생성
		// 피카츄, 전기, 백만볼트, 100, 10
		// 잠만보, 노멀, 누르기, 200, 5

		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		Pokemon jamman = new Pokemon("잠만보", "노멀", "누르기", 200, 5);

		while (true) {
			System.out.println("======선택=====");
			System.out.print("[1] 피카츄 [2] 잠만보 >>>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("======공격 선택");
				System.out.print("[1]일반공격 [2]스킬 공격 >>>");
				int choiceAtk = sc.nextInt();
				
				if (choiceAtk == 1) {
					System.out.println("피카츄는 기본 공격을 했다");
//					jamman.setHp(jamman.getHp() - pika.getAtk());
				}
				if (choiceAtk == 2) {
					System.out.println("피카츄의  백만볼트");
					System.out.println("효과는 굉장했다");
//					jamman.setHp(jamman.getHp() - (double)pika.getAtk() * 1.5);
				}
				System.out.println("===남은 hp ====");
				System.out.println("피카츄 hp :" +pika.getHp());
				System.out.println("잠만보 hp : "+jamman.getHp());
				
			}
			if (choice == 2) {
				System.out.println("======공격 선택");
				System.out.print("[1]일반공격 [2]스킬 공격 >>>");
				int choiceAtk = sc.nextInt();
				
				if (choiceAtk == 1) {
					System.out.println("잠만보는 기본 공격을 했다");
//					pika.setHp(pika.getHp() - jamman.getAtk());
				}
				if (choiceAtk == 2) {
					System.out.println("잠만보의  누르기");
					System.out.println("효과는 굉장했다");
//					pika.setHp(pika.getHp() - (double)jamman.getAtk() * 1.5);
				}
				System.out.println("===남은 hp ====");
				System.out.println("피카츄 hp :" +pika.getHp());
				System.out.println("잠만보 hp : "+jamman.getHp());
				
			}else if(choice >=3){
				System.out.println("다시 선택");
			}
			if(pika.getHp() <= 0 ) {
				System.out.println(jamman.getName()+"이(가) 이겼다!");
				System.out.println("피카츄 이(가) 쓰러졌다");
				System.out.println("종료");
				break;
			}else if(jamman.getHp() <= 0) {
				System.out.println(jamman.getName()+" 이(가) 쓰러졌다");
				System.out.println("피카츄가 이겼다!");
				System.out.println("종료");
				break;
			}
		}
	
	}

}
