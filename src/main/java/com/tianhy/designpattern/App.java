package com.tianhy.designpattern;


import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException {
        final Logger logger = Logger.getLogger("TestErrOut");
        System.out.println( "Hello World!" );
        logger.debug(" This is debug!!!");
        logger.info(" This is info!!!");
        logger.warn(" This is warn!!!");
        logger.error(" This is error!!!");
        logger.fatal(" This is fatal!!!");


    }
}
