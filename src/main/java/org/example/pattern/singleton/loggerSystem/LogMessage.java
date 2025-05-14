package org.example.pattern.singleton.loggerSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LogMessage {
    private String message;
    private LogLevel level;
    private LocalDate timestamp;

    public LogMessage(String message, LogLevel level) {
        this.message = message;
        this.level = level;
        this.timestamp = LocalDate.now();
    }
}
