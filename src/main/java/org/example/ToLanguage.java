package org.example;



public class ToLanguage {
    public int language(String str1) {
        if (str1.equals("I")) return 1;
        if (str1.equals("II")) return 2;
        if (str1.equals("III")) return 3;
        if (str1.equals("IV")) return 4;
        if (str1.equals("V")) return 5;
        if (str1.equals("VI")) return 6;
        if (str1.equals("VII")) return 7;
        if (str1.equals("VIII")) return 8;
        if (str1.equals("IX")) return 9;
        if (str1.equals("X")) return 10;

        return 0;
    }

    public String arabic(int i) throws Exception {
        StringBuilder builder = new StringBuilder();
        if (i < 1 || i > 100) {
            throw new Exception("error number format arabic");
        }
        while (i >= 100) {
            builder.append("C");
            i -= 100;
        }
        while (i >= 90) {
            builder.append("XC");
            i -= 90;
        }
        while (i >= 50) {
            builder.append("L");
            i -= 50;
        }
        while (i >= 40) {
            builder.append("XL");
            i -= 40;
        }
        while (i >= 10) {
            builder.append("X");
            i -= 10;
        }
        while (i >= 9) {
            builder.append("IX");
            i -= 9;
        }
        while (i >= 5) {
            builder.append("V");
            i -= 5;
        }
        while (i >= 4) {
            builder.append("IV");
            i -= 4;
        }
        while (i >= 1) {
            builder.append("I");
            i -= 1;
        }

        return builder.toString();
    }
}



