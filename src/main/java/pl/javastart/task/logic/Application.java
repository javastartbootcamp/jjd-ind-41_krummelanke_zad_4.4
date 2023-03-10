package pl.javastart.task.logic;

import pl.javastart.task.config.Offer;

public class Application {

    private int requestedAmount;
    private int earnings;

    public Application(int requestedAmount, int earnings) {
        this.requestedAmount = requestedAmount;
        this.earnings = earnings;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }

    public int getEarnings() {
        return earnings;
    }

    public void applicationResult(Application application) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        Offer offer = salesRepresentative.createLoanOffer(application.getRequestedAmount(), application.getEarnings());

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}
