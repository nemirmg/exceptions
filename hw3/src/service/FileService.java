package service;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import model.Person;

public class FileService {
    private final String FILES_DIR = "src/files/";

    public void saveToFile(Person person) throws IOException {
        Path path = Path.of(FILES_DIR);
        try {
            Files.createDirectory(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        String fileName = person.getLastName() + ".txt";
        Path filePath = Path.of(FILES_DIR + fileName);
        
        String data = person.toString() + "\n";
        try {
            Files.createFile(filePath);
            writeToFile(filePath, data);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл для пользователя с такой фамилией уже существует.");
            System.out.println("Новые данные будут в него добавлены.");
            writeToFile(filePath, data);
        }
    }

    private void writeToFile(Path filePath, String data) throws IOException {
        Files.writeString(filePath, data, StandardOpenOption.APPEND);
        System.out.println("Данные пользователя сохранены в файл.");
    }
}
