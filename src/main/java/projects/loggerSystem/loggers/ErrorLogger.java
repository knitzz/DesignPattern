package projects.loggerSystem.loggers;

import projects.loggerSystem.enums.LogLevel;

public class ErrorLogger implements Logger {
    private static final Integer InfoLogLevel = LogLevel.Info.ordinal();
    private final Logger nextLogger;
    public void log(LogLevel logLevel, String message) {
        if(logLevel.ordinal() == InfoLogLevel) {
            //config level check
            print(message);
        } else {
            this.nextLogger.log(logLevel, message);
        }
    }
    public void print(String message) {
        System.out.println("Message from Error logger :" +  message);
    }
    public ErrorLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}