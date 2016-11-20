package shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by Sergei on 20.11.2016.
 */
public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word with five characters: ");
        String word = readConsoleWord(in);

        if (word.compareToIgnoreCase(reversString(word)) == 0) {
            System.out.println("Palindrom Word!");
        } else {
            System.out.println("No! Sorry!");
        }

    }

    private static String readConsoleWord(Scanner in) {
        while (true) {
            String temp = in.nextLine();
            if (checkOnWord(temp)) {
                if (temp.length() == 5) {
                    return temp;
                } else {
                    System.out.print("Please, enter word with five characters! Try again: ");
                }
            } else {
                System.out.print("Not a word! try again:");
            }

        }
    }

    private static boolean checkOnWord(String word) {
        if (word.length() != 0) {
            for (int i = 0; i < word.length(); i++) {
                if (word.toCharArray()[i] >= '0' && word.toCharArray()[i] <= '9') {
                    return false;
                } else if (word.toCharArray()[i] == ' ' | word.toCharArray()[i] == '\t' | word.toCharArray()[i] == '\\') {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private static String reversString(String str) {
        if (str.length() > 1) {
            char[] strArray = str.toCharArray();
            char[] resStr = new char[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                resStr[(strArray.length - 1) - i] = strArray[i];
            }
            return new String(resStr);
        } else {
            return str;
        }
    }
}
