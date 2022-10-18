package day2;

public class AssertionEx1 {

	public enum Suits{ CLUBS, DIAMONDS, SPADES, HEARTS};
	
	
	public static void main(String[] args) {
		
	/*	int x=-1;
		if(x>0)
			System.out.println("Greater");
		else if(x==0)
			System.out.println("equal");
		else 
			assert(x>0); 
	*/	
		
		Suits suit= Suits.CLUBS;
		
		switch(suit) {
		case SPADES:
			System.out.println("Spades");
			break;
			
		default:
			assert false: "Unknown card";
		}
	}

}
