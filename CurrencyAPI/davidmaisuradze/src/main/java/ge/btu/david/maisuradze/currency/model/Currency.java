package ge.btu.david.maisuradze.currency.model;

public class Currency {
    private String currenyName;
    private double buyValue;
    private double sellValue;

    public Currency(String currenyName, double buyValue, double sellValue) {
        this.currenyName = currenyName;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
    }

    public Currency() {
    }

    public String getCurrenyName() {
        return currenyName;
    }

    public void setCurrenyName(String currenyName) {
        this.currenyName = currenyName;
    }

    public double getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(double buyValue) {
        this.buyValue = buyValue;
    }

    public double getSellValue() {
        return sellValue;
    }

    public void setSellValue(double sellValue) {
        this.sellValue = sellValue;
    }
}
