package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class LifeCycleTest {

    String temp;
    @Test
    void testA() {

        temp = "Azizi";
    }


    @Test
    void testB() {
        System.out.println(temp);
    }
}
