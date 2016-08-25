import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	Card board[] = new Card[13];
	Scanner in = new Scanner(System.in);
	
	public Player()
	{
		for(int i = 0; i < 13; i++)
		{
			board[i] = new Card(0,0);
		}
	}
	
	public boolean takeTurn(ArrayList<Card> cards, int requiredToPlay)
	{
		int played = 0;
		boolean done = false;
		while(true)
		{
			printHand(cards);
			printBoard();
			say("Which card to play");
			int cardindex = in.nextInt();
			say("Which spot to place it");
			int boardindex = in.nextInt();
			if(board[boardindex].value == 0)
			{
				board[boardindex] = cards.get(cardindex);
				cards.remove(cardindex);
				played += 1;
				
				boolean isfull = true;
				for(int i = 0; i < 13; i++)
				{
					if(board[i].value == 0)
						isfull = false;
				}
				if(isfull)
				{
					done = true;
					break;
				}
				
				if(played >= requiredToPlay)
				{
					say("Continue placing cards? 0 for no 1 for yes");
					int keepgoing = in.nextInt();
					if(keepgoing == 0)
						break;
				}
				
				if(cards.size() == 0)
					break;
			}
			else
			{
				say("Already a card there try again");
			}
		}
		return true;
	}
	
	public void printHand(ArrayList<Card> cards)
	{
		String s = "";
		for(int i = 0; i < cards.size(); i++)
		{
			s += cards.get(i).toString() + ", ";
		}
		say(s);
	}
	
	public void printBoard()
	{
		String s1 = board[0].toString() + " " + board[1].toString() + " " + board[2].toString();
		String s2 = board[3].toString() + " " + board[4].toString() + " " + board[5].toString() + " " + board[6].toString() + " " + board[7].toString();
		String s3 = board[8].toString() + " " + board[9].toString() + " " + board[10].toString() + " " + board[11].toString() + " " + board[12].toString();
		say(s1);
		say(s2);
		say(s3);
	}
	
	public void say(String s)
	{
		System.out.println(s);
	}
}
