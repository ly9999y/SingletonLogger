package com.ly9999y.srlog;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import sun.reflect.Reflection;

/**
 * @Auther: ly9999y
 * 
 * @Date: 4/19 18:13
 * @Description:
 */
public class StaticLog {
    private static Logger log4jlogger ;
    private StaticLog(){};

    public static Logger getLog() {
        String path = Logger.class.getResource("/").getPath();
        path = path+"log/log4j.properties";
        PropertyConfigurator.configure(path);
        if (log4jlogger == null){
            log4jlogger = Logger.getLogger(Reflection.getCallerClass(2).getName());
        }
        return log4jlogger;
    }

    public static void main(String[] args) {
        Logger log = StaticLog.getLog();
        log.error(1234);
    }
}
