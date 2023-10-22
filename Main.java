
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

        if (num==1) {
            System.out.printf("Сумма= %d \n",+(a+b));
        } else if (num == 2) {
            System.out.printf("Разность= %d \n", +(a-b));
        } else if (num == 3) {
            System.out.printf("Произведение= %d \n", +(a*b));
        } else {
            System.out.println("Частное= " +((double)a/b));

        }
        scanner.close();
    }
}