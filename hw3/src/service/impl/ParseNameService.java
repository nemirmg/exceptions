package service.impl;

import service.ParseService;

public class ParseNameService implements ParseService{
    private String name;

    @Override
    public boolean parseInput(String inputData) {
        if (inputData.matches("[a-zA-Zа-яёА-ЯЁ\\-]+")) {
            name = inputData;
            return true;
        }
        else {
            System.out.println("Некорректное значение для имени: " + inputData);
            return false;
        }
    }

    public String getResult() {
        return name;
    }
}
