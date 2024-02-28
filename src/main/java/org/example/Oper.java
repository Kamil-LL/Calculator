package org.example;

import java.rmi.NotBoundException;

public class Oper {
    public int operation(int a, int b, String str) throws Exception {

        int sum = 0;
        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            switch (str) {
                case "+":
                    sum = a + b;
                    break;
                case "-":
                    sum = a - b;
                    break;
                case "/":
                    sum = a / b;
                    break;
                case "*":
                    sum = a * b;
                    break;
                default:
                    throw new Exception("error operation");
            }
        } else {
            throw new Exception("error number format");
        }
        return sum;
    }
}
