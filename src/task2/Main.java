package task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        printDayOfWeek(parseDate());
    }
    private static LocalDate parseDate() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = null;
        do {
            System.out.println("Введите дату в формате dd/MM/yyyy");
            try {
                localDate = LocalDate.parse(scanner.next(), dateTimeFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("некорректный ввод");
            }
        } while (localDate == null);
        return localDate;
    }
    private static void printDayOfWeek(LocalDate localDate) {
        switch (localDate.getDayOfWeek().getValue()) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
        }
    }
}
