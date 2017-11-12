package org.bk.oldway;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTestCase
        extends TestCase {

    /**
     * 如果包含静态suite方法将会被当作TestSuit
     * @return
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
     * test方法命名规则:
     * 1）.访问权限都是public；
     * 2）.返回类型都是void;
     * 3）.没有参数；
     * 4）.方法名以“test”开头。
     */
    public void testApp() {
        assertTrue(true);
    }
}
