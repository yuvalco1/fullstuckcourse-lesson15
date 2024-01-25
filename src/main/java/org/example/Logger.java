package org.example;

public class Logger {// Singleton


    private String loggerName;
    private static Logger LoggerInstance;

    private Logger(String loggerName) {
        this.loggerName = loggerName;
    }

    public static Logger getInstance(String loggerName) { // Singleton get instance method
        if (LoggerInstance == null) {
            LoggerInstance = new Logger(loggerName);
        }
        return LoggerInstance;
    }

    public void logMessage(String message) {
        System.out.println(this.hashCode()+ " Log: " +message+ " Logger name: " +this.loggerName);
    }

}
