package service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import service.ParseService;

public class ParseDateService implements ParseService {
    private LocalDate date;

    @Override
    public boolean parseInput(String inputData) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            date = LocalDate.parse(inputData, f);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Некорректный формат даты: " + e.getMessage());
            return false;
        }
    }
    
    public LocalDate getResult() {
        return date;
    }
}
