import java.util.Random;

public class Driver {

	public static void main(String [] args) {
		Random generator = new Random();
		final int CARD_AMT = 4;
		Card[] cards = new Card[CARD_AMT];
		for(int i=0;i<CARD_AMT;i++) {
			cards[i] = new Card((new int[] {6,5,7,8})[i]);
			
		}
		
		Tree deck = new Tree();
		
		for(Card c : cards) {
			deck.insert(c);
			System.out.print("Added ");
			c.display();
			System.out.println("to deck");
		}
		
		deck.display();
		System.out.println("Count : "+deck.count());
		deck.visualize();
		deck.destroy();
		
	}
}
