package com.sysdent.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class LogConfig {

    static LogConfig logConfig;
    Logger logger;

    private LogConfig() {
	logger = Logger.getLogger(LogConfig.class.getName());

	CustomFormatter formatter = new CustomFormatter();
	ConsoleHandler handler = new ConsoleHandler();
	
	handler.setFormatter(formatter);
	logger.addHandler(handler);
	logger.setUseParentHandlers(false);
    }

    public static LogConfig getInstance() {
	if (logConfig == null) {
	    logConfig = new LogConfig();
	}

	return logConfig;
    }

    class CustomFormatter extends Formatter {
	private final DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	@Override
	public String format(LogRecord record) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(df.format(new Date(record.getMillis()))).append(" - ");
	    builder.append("[").append(record.getLevel()).append("] - ");
	    builder.append(formatMessage(record));
	    builder.append("\n");
	    return builder.toString();
	}
    }
}