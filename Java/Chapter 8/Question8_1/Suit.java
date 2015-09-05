public enum Suit {
    CLUB (0), DIAMOND (1), HEART (2), SPADE (3);
    private int value;
    private Suit(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public static Suit getSuitFromValue(int value) {
        switch (value) {
            case 0:
                return Suit.CLUB;
            case 1:
                return Suit.DIAMOND;
            case 2:
                return Suit.HEART;
            case 3:
                return Suit.SPADE;
            default:
                return null;
        }
                
    }
}
