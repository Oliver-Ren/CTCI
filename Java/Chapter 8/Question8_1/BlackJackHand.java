public class BlackJackHand extends Hand <BlackJackCard> {
    // Since there are multiple scores  availabe, which
    // is different from the default socring algorithm.
    // We should override the socre method.
    @Override
    public int score() {
        int totalScore = 0;
        for (BlackJackCard c : cards) {
            if (totalScore < 21) {
                

