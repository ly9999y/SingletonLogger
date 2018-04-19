package com.ly9999y.srlog;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @Auther: ly9999y
 * @Date: 4/19 21:02
 * @Description:
 */
public enum EnumLog {
    log;
    private Logger log4jlogger;

    EnumLog() {
        String path = Logger.class.getResource("/").getPath();
        path = path+"log/log4j.properties";
        PropertyConfigurator.configure(path);
        log4jlogger = Logger.getLogger(path);
    }

    public void fatal(Object msg){
        log4jlogger.fatal(msg);
    }
    public void fatal(Object msg, Throwable t){
        log4jlogger.fatal(msg, t);
    }

    public void error(Object msg){
        log4jlogger.error(msg);
    }
    public void error(Object msg, Throwable t){
        log4jlogger.error(msg, t);
    }

    public void warn(Object msg){
        log4jlogger.warn(msg);
    }
    public void warn(Object msg, Throwable t){
        log4jlogger.warn(msg, t);
    }
    public void debug(Object msg){
        log4jlogger.debug(msg);
    }
    public void debug(Object msg, Throwable t){
        log4jlogger.debug(msg, t);
    }
    public void info(Object msg){
        log4jlogger.info(msg);
    }
    public void info(Object msg, Throwable t){
        log4jlogger.info(msg, t);
    }


}
