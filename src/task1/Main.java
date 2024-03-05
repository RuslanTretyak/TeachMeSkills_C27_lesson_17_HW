package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int way = -1;
        do {
            System.out.println("введите цифру 1 или 2");
            String temp = scanner.next();
            try {
                way = Integer.parseInt(temp);
                if (way != 1 && way != 2) {
                    System.out.println("некорректный ввод");
                }
            } catch (NumberFormatException e) {
                System.out.println("некорректный ввод");
            }
        } while (way != 1 && way != 2);
        useMyFuncInterface(way);

    }
    private static void useMyFuncInterface(int way) {
        Scanner scanner = new Scanner(System.in);
        if (way == 1) {
            MyFuncInterface<String> myFuncInterface = str -> {
              String newString = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    newString += str.substring(i, i + 1);
                }
                return newString;
            };
            System.out.println("введите строку для реверса");
            System.out.println(myFuncInterface.funcInterfaceMethod(scanner.nextLine()));
        } else {
            MyFuncInterface<Integer> myFuncInterface = integer -> {
                if (integer == 0) {
                    return 1;
                } else {
                    int result = 1;
                    for (int i = 1; i <= integer; i++) {
                        result *= i;
                    }
                    return result;
                }
            };
            int factorial = -1;
            do {
                System.out.println("введите неотрицательное число для вычисления факториала");
                String temp = scanner.next();
                try {
                    factorial = Integer.parseInt(temp);
                    if (factorial < 0) {
                        System.out.println("некорректный ввод");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("некорректный ввод");
                }
            } while (factorial < 0);
            System.out.println(myFuncInterface.funcInterfaceMethod(factorial));
        }

    }
}
