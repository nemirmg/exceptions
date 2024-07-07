package view;

import controller.DataController;

public class PersonView {
    DataController service = new DataController();

    public void start() {
        while (true) {
            service.getInput();
        
        while (!service.isInputDataFull()) {
            service.tryAgain();
            service.getInput();
        }
        
        while (!service.isInputDataValid()) {
            service.tryAgain();
            service.getInput();
        }

        service.saveToFile();
        service.tryAgain();
        }
    }
}
