package org.example;

public class Main {
    public static void main(String[] args) {


        Logger logger1 = Logger.getInstance("logger1");
        Logger logger2 = Logger.getInstance("logger2");

        logger1.logMessage("Hello");
        logger2.logMessage("World");

        System.out.println(logger1 == logger2);
        System.out.println(logger1.equals(logger2));

    }
}