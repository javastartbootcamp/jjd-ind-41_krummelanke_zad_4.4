package pl.javastart.task.logic;

import pl.javastart.task.config.Config;
import pl.javastart.task.config.Offer;

class SalesRepresentative {

    private Config config;

    SalesRepresentative() {
        this.config = new Config();
    }

    Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.setPercentage(config.getPercentage());
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }

}
