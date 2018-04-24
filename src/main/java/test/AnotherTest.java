package test;

public class AnotherTest {
    private static AnotherTest ourInstance = new AnotherTest();

    public static AnotherTest getInstance() {
        return ourInstance;
    }

    private AnotherTest() {
    }
}
