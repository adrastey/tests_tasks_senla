package third;

import java.util.Random;
import java.util.Scanner;

public class Third_task {
    private static final String alphavet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
    public static void main(String[] args) {
        boolean exit = false;
        while (exit == false) {
            System.out.println("Введите длину пароля: ");
            Scanner in = new Scanner(System.in);
            int length = in.nextInt();
            if (length < 8){
                System.out.println("Слишком малелькая длина пароля, попробуйте снова");
            } else if (length > 12) {
                System.out.println("Слишком большая длина пароля, попробуйте снова");
            } else {
                String password = generatePassword(length);
                System.out.println("Пароль: " + password);
                exit = true;
            }
        }
        
    }
    private static String generatePassword(int length) {
        Random r = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = r.nextInt(alphavet.length());
            stringBuilder.append(alphavet.charAt(index));
        }

        return stringBuilder.toString();
    }
}
