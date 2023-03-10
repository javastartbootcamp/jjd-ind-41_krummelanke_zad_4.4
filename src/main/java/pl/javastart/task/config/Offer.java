package pl.javastart.task.config;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    public boolean isValid() {
        return valid;
    }

    public double getValue() {
        return value;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
