package service;

import java.util.Scanner;

public interface TryAgainService {
    default void tryAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Попробуете ещё раз? (y/n)");
        String str = sc.nextLine();

        if (str.equals("n")) {
            System.out.println("До свидания!");
            System.exit(0);
        }
    }
}
