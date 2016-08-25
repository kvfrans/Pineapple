import java.util.ArrayList;


public class Game {
	
	Player p;
	Deck d;
	
	public Game()
	{
		d = new Deck();
		p = new Player();
		playerTurn(5, 5);
		
		while(true)
		{
			if(playerTurn(3,2))
				break;
		}

		
	}
	
	public boolean playerTurn(int numcards, int requiredToPlay)
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		for(int i = 0; i < numcards; i++)
		{
			cards.add(d.draw());
		}
		return p.takeTurn(cards, requiredToPlay);
		
	}

}
