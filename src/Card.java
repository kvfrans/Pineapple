
public class Card {
	int value;
	int rank;
	
	public Card(int v, int r)
	{
		value = v;
		rank = r;
	}
	
	public String toString()
	{
		if(value == 0)
			return "[No card]";
		String rankstring = "";
		if(rank == 0)
			rankstring = "Clover";
		if(rank == 1)
			rankstring = "Diamond";
		if(rank == 2)
			rankstring = "Heart";
		if(rank == 3)
			rankstring = "Spade";
		return "[" + value + " of " + rankstring + "]";
	}
}
