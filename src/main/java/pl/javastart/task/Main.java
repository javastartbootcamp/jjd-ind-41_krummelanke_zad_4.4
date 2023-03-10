package pl.javastart.task;

import pl.javastart.task.logic.Application;

class Main {

    public static void main(String[] args) {
        Application application = new Application(2_500_000, 2000);

        Application applicationOutput = new Application(application.getRequestedAmount(), application.getEarnings());
        applicationOutput.applicationResult(application);

    }
}