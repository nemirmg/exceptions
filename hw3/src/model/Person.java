package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private long phoneNumber;
    private char gender;

    public Person() {}

    public Person(String lastName, String firstName, String middleName, 
                  LocalDate birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + 
               firstName + " " + 
               middleName + " " + 
               birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " " + 
               phoneNumber + " " + 
               gender;
    }

    public String getLastName() {
        return lastName;
    }
}