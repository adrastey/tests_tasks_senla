package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second_task {
    public static final double dollar = 97.19;
    public static final double euro = 104.99;
    public static final double sterling = 125.97;
    public static final double uane = 13.65;
    public static final double lira = 2.84;
    public static void main(String[] args) {

        System.out.println("Введите значение в рублях: ");

        Scanner in = new Scanner(System.in);
        double rubl = in.nextDouble();
        double reset = rubl;
        boolean exit = false;

        while (exit == false) {
            try {
                System.out.println("Выберите валюту, в которыую ходите конверитировать");
                System.out.println("5. Доллары");
                System.out.println("4. Евро");
                System.out.println("3. Фунты стерлингов");
                System.out.println("2. Юани");
                System.out.println("1. Лиры");
                System.out.println("0. Выход");
                int value = in.nextInt();
                switch (value){
                    case 5:
                        rubl /= dollar;
                        System.out.println(rubl);
                        rubl = reset;
                        break;
                    case 4:
                        rubl /= euro;
                        System.out.println(rubl);
                        rubl = reset;
                        break;
                    case 3:
                        rubl /= sterling;
                        System.out.println(rubl);
                        rubl = reset;
                        break;
                    case 2:
                        rubl /= uane;
                        System.out.println(rubl);
                        rubl = reset;
                        break;
                    case 1:
                        rubl /= lira;
                        System.out.println(rubl);
                        rubl = reset;
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Некорректный ввод, попробуйте снова");
                }

            }catch (InputMismatchException e) {
                System.out.println("Некорректный ввод, попробуйте снова");
                break;
            }
        }
    }
}
