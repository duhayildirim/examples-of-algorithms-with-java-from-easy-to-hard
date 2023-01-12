package Middle;

import java.util.*;
import java.io.*;

public class LetterCapitalize {
    public static void main(String[] args) {
//        Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.
//        Examples:
//        Input: "hello world"
//        Output: Hello World
        Scanner input = new Scanner(System.in);
        System.out.println(LetterCapitalize(input.nextLine()));
    }

    public static String LetterCapitalize(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord.trim();
    }
}
