package org.example.pattern.singleton.loggerSystem;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static volatile Logger instance;
    private final List<LogMessage> logMessages;
    private Logger () {
        this.logMessages = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message, LogLevel level) {
        LogMessage logMessage = new LogMessage(message, level);
        logMessages.add(logMessage);
        System.out.println(logMessage);
    }

    public List<LogMessage> getLogMessages() {
        return new ArrayList<>(logMessages);
    }

    public List<LogMessage> getLogMessagesByLevel(LogLevel level) {
        List<LogMessage> filteredMessages = new ArrayList<>();
        for (LogMessage logMessage : logMessages) {
            if (logMessage.getLevel() == level) {
                filteredMessages.add(logMessage);
            }
        }
        return filteredMessages;
    }

    public void printAllLogs() {
        for (LogMessage logMessage : logMessages) {
            System.out.println(logMessage);
        }
    }

    public void printLogsByLevel(LogLevel level) {
        List<LogMessage> filteredMessages = getLogMessagesByLevel(level);
        for (LogMessage logMessage : filteredMessages) {
            System.out.println(logMessage);
        }
    }

    public void clearLogs() {
        logMessages.clear();
    }
}
