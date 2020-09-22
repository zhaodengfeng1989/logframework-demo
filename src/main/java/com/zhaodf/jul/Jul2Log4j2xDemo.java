package com.zhaodf.jul;

import org.apache.logging.log4j.jul.CoreLoggerAdapter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 类：Jul2Slf4jDemo
 *
 * @author zhaodf
 * @date 2020/9/18
 */
public class Jul2Log4j2xDemo {
    public static void main(String[] args) {
        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
        Logger logger=Logger.getLogger(Jul2Log4j2xDemo.class.getName());
        logger.info("jul info a msg");
    }
}
