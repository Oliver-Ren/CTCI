public class Deck <T extends Card> {
    private ArrayList<T> cards; //all cards, dealt or not
    private int dealIndex = 0; // marks first undealt card

    public void setDeckOfCards(ArrayList<T> deckOfCards) {
        cards = deckOfCards;
    }
    
    public void shuffle() {
        int N = cards.length();
        for (int i = 0; i < N; i++) {
            int r = i + (int)(Math.Random() * (N - i)); 
            T temp = cards.get(i);
            cards.set(i, cards.get(r));
            cards.set(r, T);
        }

    }

    public int remainingCards() {
        return cards.size() - dealtIndex;
    }

    public T[] dealHand(int number) {
        if (remainingCards < number) {
            return null;
        }

        T[] hand = (T[]) Card[number];
        
        for (int i = 0; i < number; i++) {
            T dealt = dealCard();
            if (dealt != null) {
                hand[i] = dealt;
            }
        }

        return hand;


    }

    public T dealCard() {
        if (remainingCards == 0) {
            return null;
        }

        T card = cards.get(dealIndex);
        card.markUnavailable();
        dealtIndex++;

        return card;
    }



    

