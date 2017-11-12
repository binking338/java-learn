package org.bk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logback
 * https://logback.qos.ch/
 *
 */
public class App
{
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.error("test error");
        logger.info("test info");
        logger.debug("test debug");
        for(int i = 0;i<10;i++) {
            logger.error("hello logback!");
            logger.info("hello logback!");
            logger.debug("hello logback!");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
