package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.printf("Введите число нужного действия \n" +
                " 1 Сложение \n 2 Вычитание \n 3 Умножение \n 4 Деление ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Сумма= " +(a+b));
                break;
            case 2:
                System.out.println("Разность= " +(a-b));
                break;
            case 3:
                System.out.println("Произведение= " +(a*b));
                break;
            case 4:
                System.out.println("Частное= " +((double)a/b));

        }
        scanner.close();
    }
}

