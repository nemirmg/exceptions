package service;

import java.time.LocalDate;

import service.impl.ParseDateService;
import service.impl.ParseGenderService;
import service.impl.ParseNameService;
import service.impl.ParsePhoneService;

public class ValidationService {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private long phoneNumber;
    private char gender;

    public boolean isInputDataValid(String[] inputData) {
        ParseNameService parseLastName = new ParseNameService();
        ParseNameService parseFirstName = new ParseNameService();
        ParseNameService parseMiddleName = new ParseNameService();
        ParseDateService parseBirthDate = new ParseDateService();
        ParsePhoneService parsePhoneNumber = new ParsePhoneService();
        ParseGenderService parseGender = new ParseGenderService();
        boolean parseOk = true;
        boolean f;
        for (int i = 0; i < inputData.length; i++) {
            switch (i) {
                case 0:
                    f = parseLastName.parseInput(inputData[i]);
                    if (f) this.lastName = parseLastName.getResult();
                    parseOk &= f;
                    break;
                case 1:
                    f = parseFirstName.parseInput(inputData[i]);
                    if (f) this.firstName = parseFirstName.getResult();
                    parseOk &= f;
                    break;
                case 2:
                    f = parseMiddleName.parseInput(inputData[i]);
                    if (f) this.middleName = parseMiddleName.getResult();
                    parseOk &= f;
                    break;
                case 3:
                    f = parseBirthDate.parseInput(inputData[i]);
                    if (f) this.birthDate = parseBirthDate.getResult();
                    parseOk &= f;
                    break;
                case 4:
                    f = parsePhoneNumber.parseInput(inputData[i]);
                    if (f) this.phoneNumber = parsePhoneNumber.getResult();
                    parseOk &= f;
                    break;
                case 5:
                    f = parseGender.parseInput(inputData[i]);
                    if (f) this.gender = parseGender.getResult();
                    parseOk &= f;
                    break;
            }
        }
        return parseOk;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
    
    
}
