public abstract class Card {
    private boolean available = true;

    /* number or face that's on card. */
    protected Suit suit;

    public Card(int c, Suit s) {
        faceValue = c;
        suit = s;
    }

    public abstract int value();

    public Suit getSuit() {
        return suit;
    }

    /* Checks if the card is available to the 
       given out to someone */
    public boolean isAvailable() {
        return available;
    }

    public void markAvailable() {
        available = true;
    }

}
