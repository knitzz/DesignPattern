package projects.loggerSystem.loggerManager;

import projects.loggerSystem.enums.LogLevel;
import projects.loggerSystem.factory.LoggerFactory;
import projects.loggerSystem.loggers.Logger;


public class LoggerManager {
    private final Logger logger;
    private static LoggerManager instance ;
    public static LoggerManager getLoggerManager() {
        if (instance == null) {
            instance = new LoggerManager();
        }
        return instance;
    }
    public Logger getLogger() {
        return this.logger;
    }
    private LoggerManager() {
        LogLevel[] logLevels = LogLevel.values();
        Logger nextLogger = null;
        for (int i=logLevels.length-1;i>=0;i--) {
            nextLogger = LoggerFactory.createLogger(logLevels[i], nextLogger);
        }
        this.logger = nextLogger;
    }

}
