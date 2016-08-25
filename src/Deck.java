import java.util.ArrayList;


public class Deck {
	
	ArrayList<Card> cards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
		int count = 0;
		for(int r = 0; r < 4; r++)
		{
			for(int v = 1; v < 14; v++)
			{
				cards.add(new Card(v,r));
				count += 1;
			}
		}
	}
	
	public Card draw()
	{
		int random = (int) (Math.random() * cards.size());
		Card c = cards.get(random);
		cards.remove(random);
		return c;
	}

}
