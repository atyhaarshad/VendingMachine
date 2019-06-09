public enum CoinType {

    POUND(1.00),
    FIFTY(0.50),
    TWENTY(0.20),
    TEN(0.10),
    FIVE(0.05),
    TWO(0.02),
    ONE(0.01);

    private final double value;

    CoinType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
