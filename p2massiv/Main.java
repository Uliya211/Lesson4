package p2massiv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int sum1 = 0;
        int sum2 = 0;
        double sr = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101) - 50;
            if (arr[i] > 0) {
                positive++;
                try {
                    sum1=arr[i];
                    sum1+=sum1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            } else if (arr[i] < 0) {
                negative++;
                try {
                    sum2=arr[i];
                    sum2+=sum2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            } else {
                zero++;
                        }


         }

        sr=(sum1+sum2)/50;

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Количество положительных элементов: " + positive);
        System.out.println("Количество отрицательных элементов: " + negative);
        System.out.println("Количество нулевых элементов: " + zero);
        System.out.println("Сумма положительных элементов: " + sum1);
        System.out.println("Сумма отрицательных элементов: " + sum2);
        System.out.println("Среднее число по массиву: " + sr);
    }
}




