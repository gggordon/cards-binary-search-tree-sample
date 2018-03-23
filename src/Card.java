//edit
public class Card {
    private int number;
    private String suite;
    
    public static final String SPADE="spade";
    public static final String HEART="heart";
    public static final String DIAMOND="diamond";
    public static final String CLUB="club";
    
    public Card() {
    	this(0);
    }
    
    
    
    @Override
	public String toString() {
		return "Card [number=" + number + ", suite=" + suite + "]";
	}
    
    public void display() {
    	System.out.println(toString());
    }

	public Card(int number) {
    	this(number,SPADE);
    }
	public Card(int number, String suite) {
		super();
		this.number = number;
		this.suite = suite;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	
	public boolean isGreaterThan(Card otherCard) {
		if(otherCard == null)return false;
		if(otherCard.getNumber() > this.getNumber()  ) {
			return true;
		}else {
		    return false;
		}
	}
    
    
}
