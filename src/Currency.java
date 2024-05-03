public class Currency {
    private Integer amountInCents;

    public Currency(Integer amountInCents) {
        this.amountInCents = amountInCents;
    }

    public String toString() {
        return "R$ " + this.amountInCents / 100 + "," + this.padNumberWithZeros(this.amountInCents % 100, 2);
    }

    private String padNumberWithZeros(Integer input, Integer length) {
        return String.format("%1$" + length + "s", input).replace(' ', '0');
    }

    public void addCents(Integer centsToBeAdded) {
        this.amountInCents += centsToBeAdded;
    }

    public void subtractCents(Integer centsToBeSubtracted) {
        this.amountInCents -= centsToBeSubtracted;
    }

    public Integer getAmountInCents() {
        return this.amountInCents;
    }
}
