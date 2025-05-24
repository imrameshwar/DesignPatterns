package org.example.pattern.singleton.loggerSystem;

public class LoggerClient {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Log messages of different levels
        logger.log("This is an info message", LogLevel.INFO);
        logger.log("This is a warning message", LogLevel.WARNING);
        logger.log("This is an error message", LogLevel.ERROR);

        // Print all logs
        System.out.println("\nAll Logs:");
        logger.printAllLogs();

        // Print logs by level
        System.out.println("\nError Logs:");
        logger.printLogsByLevel(LogLevel.ERROR);

        // Clear logs
        logger.clearLogs();
        System.out.println("\nLogs after clearing:");
        logger.printAllLogs();

    }
}
