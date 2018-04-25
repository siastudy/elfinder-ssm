package test;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class HelloTest {
    private static HelloTest ourInstance = new HelloTest();

    public static HelloTest getInstance() {
        return ourInstance;
    }

    private HelloTest() {


        PropertyPlaceholderConfigurer config = new PropertyPlaceholderConfigurer();




    }
}
