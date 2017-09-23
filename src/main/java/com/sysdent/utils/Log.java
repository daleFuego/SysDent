package com.sysdent.utils;

import java.util.logging.Level;

/*****************************
 * Project: SysDent
 * Class:   Log
 * Author:  Magdalena Matusiak
 * Created: 23.09.2017
 *****************************/

public class Log {

    public static void error(String msg) {
	LogConfig.getInstance().logger.log(Level.SEVERE, msg);
    }
    
    public static void logWarning(String msg) {
	LogConfig.getInstance().logger.log(Level.WARNING, msg);
    }
    
    public static void log(String msg) {
	LogConfig.getInstance().logger.log(Level.INFO, msg);
    }
}
