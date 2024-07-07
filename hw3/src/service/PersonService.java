package service;

import java.time.LocalDate;

import model.Person;

public class PersonService {
    
    public Person createPerson() {
        return new Person();
    }
    
    public Person createPerson(String lastName, String firstName, 
                               String middleName, LocalDate birthDate, 
                               long phoneNumber, char gender) {
        return new Person(lastName, firstName, middleName, 
                          birthDate, phoneNumber, gender);
    }
}
