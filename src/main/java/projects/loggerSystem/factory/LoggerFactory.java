package projects.loggerSystem.factory;

import projects.loggerSystem.enums.LogLevel;
import projects.loggerSystem.loggers.*;

public class LoggerFactory {

    public static Logger createLogger(LogLevel logLevel, Logger nextLogger) {
        return switch (logLevel) {
            case Info -> new InfoLogger(nextLogger);
            case Debug -> new DebugLogger(nextLogger);
            case Error -> new ErrorLogger(nextLogger);
            case Warn -> new WarningLogger(nextLogger);
        };
    }
}
