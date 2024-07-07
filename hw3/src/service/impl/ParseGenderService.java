package service.impl;

import service.ParseService;

public class ParseGenderService implements ParseService {
    private char gender;

    @Override
    public boolean parseInput(String inputData) {
        if (inputData.equals("f") || inputData.equals("m")) {
            gender = inputData.charAt(0);
            return true;
        } else {
            System.out.println("Неверное значение для пола: " + inputData);
            return false;
        }
    }

    public char getResult() {
        return gender;
    }
}
