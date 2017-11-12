package org.bk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Log4j2
 * http://logging.apache.org/log4j/2.x/index.html
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
            logger.error("hello logj4j2!");
            logger.info("hello logj4j2!");
            logger.debug("hello logj4j2!");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
