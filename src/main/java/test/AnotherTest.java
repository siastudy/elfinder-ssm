package test;


import org.apache.log4j.Logger;

public class AnotherTest {
    private static AnotherTest ourInstance = new AnotherTest();
    private static Logger logger = Logger.getLogger(AnotherTest.class);

    public static AnotherTest getInstance() {
        return ourInstance;
    }

    private AnotherTest() {

        System.out.print("this is a test");

    }
}
