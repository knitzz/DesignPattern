package projects.loggerSystem.loggers;

import projects.loggerSystem.enums.LogLevel;

public interface Logger {
    void log(LogLevel logLevel, String message);
    void print(String message);
}
