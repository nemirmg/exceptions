package service.impl;

import service.ParseService;

public class ParsePhoneService implements ParseService {
    private Long phoneNumber;

    @Override
    public boolean parseInput(String inputData) {
        try {
            phoneNumber = Long.parseLong(inputData);
            return true;
        } catch (NumberFormatException e) {
            System.out.print("Номер телефона должен состоять только из цифр: ");
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Long getResult() {
        return phoneNumber;
    }
}