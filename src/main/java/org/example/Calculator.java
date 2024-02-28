package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] divide = string.split(" ");

        Oper oper = new Oper();
        ToLanguage lan = new ToLanguage();

        if (divide[0].contains("I") || divide[0].contains("V") || divide[0].contains("X")
                || divide[2].contains("I") || divide[2].contains("V") || divide[2].contains("X")) {
            int perevod = (oper.operation(lan.language(divide[0]), lan.language(divide[2]), divide[1]));
            System.out.println(lan.arabic(perevod));

        } else {
            System.out.println(oper.operation(parseInt(divide[0]), parseInt(divide[2]), divide[1]));
        }
    }
}
