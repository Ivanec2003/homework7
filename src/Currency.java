public enum Currency {
    UAH(30.22),
    EUR(45.10),
    GBP(25.33);
    private final Double rateDollar;
    Currency(Double rateDollar){
        this.rateDollar = rateDollar;
    }

    public Double getRateDollar() {
        return rateDollar;
    }
}
