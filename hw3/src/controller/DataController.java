package controller;

import java.io.IOException;

import model.Person;
import service.FileService;
import service.InputService;
import service.PersonService;
import service.TryAgainService;
import service.ValidationService;

public class DataController implements TryAgainService {
    private InputService iService = new InputService();
    private ValidationService vService = new ValidationService();
    private PersonService pService = new PersonService();
    private FileService fService = new FileService();
    
    public void getInput() {
        iService.getInput();
    }

    public boolean isInputDataFull() {
        return iService.isInputDataFull();
    }

    public boolean isInputDataValid() {
        return vService.isInputDataValid(iService.getInputData());
    }

    private Person createPerson() {
        return pService.createPerson(vService.getLastName(), 
                                     vService.getFirstName(), 
                                     vService.getMiddleName(), 
                                     vService.getBirthDate(), 
                                     vService.getPhoneNumber(), 
                                     vService.getGender());
    }

    public void saveToFile() {
        try {
            fService.saveToFile(createPerson());
        } catch(IOException e) {
            System.err.println("Ошибка при записи файла.");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
