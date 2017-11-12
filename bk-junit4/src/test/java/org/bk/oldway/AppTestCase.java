package org.bk.oldway;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTestCase
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTestCase(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTestCase.class);
    }

    /**
     * 测试开始前
     * @throws Exception
     */
    public void setUp() throws Exception {
        System.out.println(this.getName() + " setUp");
    }

    /**
     * 测试结束后
     * @throws Exception
     */
    public void tearDown() throws Exception {
        System.out.println(this.getName() + " tearDown");
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
