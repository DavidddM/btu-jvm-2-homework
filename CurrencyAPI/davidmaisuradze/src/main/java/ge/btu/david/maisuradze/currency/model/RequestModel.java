package ge.btu.david.maisuradze.currency.model;

public class RequestModel {
    private String to;
    private double amount;

    public RequestModel() {
    }

    public RequestModel(String to, double amount) {
        this.to = to;
        this.amount = amount;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
