package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		//마리오 게임칩 꺼내오기
		Mario m = new Mario();
		//게임칩을 넣기
		On(m);
		
		Zelda z = new Zelda();
		On(z);
		
		Pokemongo pg = new Pokemongo();
		On(pg);
		
		Dongmul dd = new Dongmul();
		dd.gameStart();
		

	}
	
	
	private static void On(Mario m) {
		m.gameStart();
	}
	//메소드 오버로딩으로 작성
//	private static void On(Zelda z) {
//		z.gameStart();
//	}
//	private static void On(Pokemongo p) {
//		p.gameStart();
//	}

}
