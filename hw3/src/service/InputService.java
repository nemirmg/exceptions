package service;

import java.util.Scanner;

public class InputService {
    private final String[] PERSON_PARAM = {
        "Фамилия",
        "Имя",
        "Отчество",
        "дата_рождения (dd.mm.yyyy)",
        "номер_телефона (только цифры)",
        "пол (f/m)" 
    };
    private final String DELIMITER = " ";
    private String line;
    private String[] inputData;
    
    private String getPrompt(String msg) {
        StringBuilder sb = new StringBuilder(msg);
        for (int i = 0; i < PERSON_PARAM.length; i++) {
            sb.append(String.format("\n   %s. %s", i + 1, PERSON_PARAM[i]));
        }
        return sb.toString();
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println(getPrompt("Введите данные пользователя через ПРОБЕЛ:"));
        this.line = sc.nextLine();
        this.inputData = line.split(DELIMITER);
    }

    public boolean isInputDataFull() {
        int delta = PERSON_PARAM.length - inputData.length;
        if (delta == 0) return true;
        else if (delta > 0) {
            System.out.println("\nВведено меньше данных, чем требуется:");
            System.out.println(line);
            System.out.println("Похоже, пропущено полей - " + Math.abs(delta));
            return false;
        } else {
            System.out.println("\nВведено больше данных, чем требуется:");
            System.out.println(line);
            System.out.println("Похоже, лишних полей - " + Math.abs(delta));
            return false;
        }
    }

    public String[] getInputData() {
        return inputData;
    }
}
