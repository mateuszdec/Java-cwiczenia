package lekcja21_typWyliczeniowy_enum.zad1;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSauce;
    private final boolean chesse;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSauce, boolean chesse, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.chesse = chesse;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        String result = name() + " (";
        if (tomatoSauce) {
            result += "sos pomidorowy";
        }
        if (chesse) {
            result += ", ser";
        }
        if (mushrooms) {
            result += ", pieczarki";
        }
        if (ham) {
            result += ", szynka";
        }
        result += ")";
        return result;
    }
}
