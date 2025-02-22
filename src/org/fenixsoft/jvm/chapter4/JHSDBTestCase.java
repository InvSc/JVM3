package org.fenixsoft.jvm.chapter4;

/**
 * staticObj、instanceObj、localObj存放在哪里？
 * 这里采用的运行参数：
 *  -Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 */
public class JHSDBTestCase {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");    // 这里设一个断点
        }
    }

    private static class ObjectHolder {}

    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
}
