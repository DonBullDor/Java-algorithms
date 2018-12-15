
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameEntry g1 = new GameEntry("mike", 1105);
		GameEntry g2 = new GameEntry("rob", 750);
		GameEntry g3 = new GameEntry("paul", 720);
		GameEntry g4 = new GameEntry("anaa", 660);
		GameEntry g5 = new GameEntry("rose", 590);
		GameEntry g6 = new GameEntry("jack", 510);
		
		ScoreBoard board1 = new ScoreBoard(5);
		board1.add(g1);
		board1.add(g2);
		board1.add(g3);
		board1.add(g4);
		board1.add(g5);
		board1.add(g6);
		
		
		
		
		
		
		//board1.remove(1);
		board1.show();
		
		
		
	}

}
