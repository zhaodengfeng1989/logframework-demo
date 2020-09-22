package com.zhaodf.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 类：Log4j2
 *
 * @author zhaodf
 * @date 2020/9/17
 */
public class Log4j2x2Slf4j {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4j2Demo.class);
        logger.info("{} 数学得分为 {} .", "hanxb","100");
    }
}
