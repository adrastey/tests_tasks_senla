package org.example;

import java.util.Random;
import java.util.Scanner;

public class First_tasks {
    public static final String[] words = new String[] {
            "транзистор",
            "резистор",
            "тиристор",
            "коннектор",
            "диод",
            "катушка"
    };
    private static final int max_attemps = 7;
    public static void main(String[] args) {

        String random_word = getRandom(words);
        char[] arr_word = random_word.toCharArray();
        char[] think_word = new char[arr_word.length];
        for (int i = 0; i < think_word.length; i++) {
            think_word[i] += '_';
        }
        boolean game_won = false;
        int attemps = max_attemps;

        while (attemps > 0 && !game_won) {
            Scanner in = new Scanner(System.in);
            System.out.println("На данный момент слово выглядит так: " + new String(think_word));
            System.out.println("Жизней осталось: " + attemps);
            System.out.println("Введите букву: ");
            char letter = in.next().charAt(0);
            if (random_word.indexOf(letter) != -1) {
                for (int c = 0; c < arr_word.length; c++) {
                    if (random_word.charAt(c) == letter) {
                        think_word[c] = letter;
                    }
                }
                if (new String(think_word).equals(random_word))
                    game_won = true;
            }
            else {
                attemps--;
                switch (attemps){
                    case 6:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |
                                 |
                                 |
                                 |
                                 |
                                ----------
                                """
                        );
                        break;
                    case 5:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |    O
                                 |
                                 |
                                 |
                                 |
                                ----------
                                """
                        );
                        break;
                    case 4:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |    O
                                 |    |
                                 | 
                                 |   
                                 |    
                                ----------
                                """
                        );
                        break;
                    case 3:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |    O
                                 |   /|
                                 |   
                                 |   
                                 |   
                                ----------
                                """
                        );
                        break;
                    case 2:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |    O
                                 |   /|\\
                                 |   
                                 |   
                                 |     
                                ----------
                                """
                        );
                        break;
                    case 1:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |    O
                                 |   /|\\
                                 |   /
                                 |   
                                 |    
                                ----------
                                """
                        );
                        break;
                    case 0:
                        System.out.println(
                                """
                                 ------
                                 |    |
                                 |    O
                                 |   /|\\
                                 |   / \\
                                 |   
                                 |   
                                ----------
                                """
                        );
                        break;
                }

            }
        }

        if (game_won)
            System.out.println("Подзравляем, вы победили, загаданное слово: " + random_word);
        else
            System.out.println("Вы проиграли, ваши жизни закончились, загаданное слово было: " + random_word);

    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}