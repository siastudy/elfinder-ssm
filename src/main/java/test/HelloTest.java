package test;

public class HelloTest {
    private static HelloTest ourInstance = new HelloTest();

    public static HelloTest getInstance() {
        return ourInstance;
    }

    private HelloTest() {
    }
}
