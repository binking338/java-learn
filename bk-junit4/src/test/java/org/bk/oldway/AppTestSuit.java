package org.bk.oldway;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AppTestSuit extends TestSuite {

    /**
     * suite方法命名规则如下：
     * 1）.必须以“suite”方法命名；
     * 2）.suite方法的访问修饰权限必须为static；
     * 3）.suite方法必须为静态方法；
     * 4）.suite方法必须没有参数。
     * @return
     */
    public static Test suite() {
        // 创建TestSuite对象
        TestSuite suite = new TestSuite();
        // 为TestSuite添加一个测试用例集合
        // 通过参数可以知道，其实该参数就是TestCase的子类
        suite.addTestSuite(AppTestCase.class);
        // 创建具体的测试用例
        Test test = TestSuite.createTest(AppTestCase.class, "testApp");
        // 添加一个具体的测试用例
        suite.addTest(test);
        return suite;
    }

}
