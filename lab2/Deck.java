//package com.tasks3.carddeck;

 class Card {
	private Rank rank;
	private Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
 
class Rank {
	public static final Rank ACE = new Rank("Ace");
	public static final Rank KING = new Rank("King");
	public static final Rank QUEEN = new Rank("Queen");
	public static final Rank JACK = new Rank("Jack");
	public static final Rank TEN = new Rank("10");
	public static final Rank NINE = new Rank("9");
	public static final Rank EIGHT = new Rank("8");
	public static final Rank SEVEN = new Rank("7");
	public static final Rank SIX = new Rank("6");

	public static Rank[] values = { ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX };

	private String name;

	Rank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
     
  class Suit {
	public static final Suit HEARTS = new Suit("HEARTS");
	public static final Suit DIAMONDS = new Suit("DIAMONDS");
	public static final Suit CLUBS = new Suit("CLUBS");
	public static final Suit SPADES = new Suit("SPADES");
	
	public static Suit[] values = { HEARTS, DIAMONDS, CLUBS, SPADES};
	
	private String name;

	Suit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}


public class Deck {


	    private Card cards[];
	    private int size;
	    private Card used[];
	    
	    public Deck()
	    {
	        int index = 0;
	        this.size = 36;
	        cards  = new Card[this.size];
	        used = new Card[this.size];
	        for(int i = 0; i < 4; i++)
	        {
	            for(int j = 0; j < 9; j++)
	            {
	                this.cards[index++] = new Card(Rank.values[j], Suit.values[i]);
	            }
	        }
	    }
	    
	    public void shuffle() {

	        for(int i = 0; i < this.size; i++) {
	            int random_num = (int)(Math.random()*this.size);

	            Card tmp = this.cards[i];
	            this.cards[i] = this.cards[random_num];
	            this.cards[random_num] = tmp;
	        }

	    }

	    public void order() {
	        int index = 0;
	        for(int i = 0; i < 4; i++)
	        {
	            for(int j = 0; j < 9; j++)
	            {
	                boolean create = true;
	                for(int k = size; k < 36; k++)
	                {
	                    if((used[k].getRank() == Rank.values[i])&&(used[k].getSuit() == Suit.values[j]))
	                        create = false;
	                }
	                if(create) {
	                    this.cards[index].setRank(Rank.values[j]);
	                    this.cards[index].setSuit(Suit.values[i]);
	                    index++;s
	                }
	            }
	        }
	    }
	    
	    public boolean hasNext() {
	        if(size != 0)
	            return true;
	        else
	            return false;
	    }
	    
	    public Card drawOne() {
	        size--;
	        if(size >= 0) {
	            used[size] = new Card(cards[size].getRank(), cards[size].getSuit());
	            return cards[size];
	        }
	        else
	            return null;
	    }
}
