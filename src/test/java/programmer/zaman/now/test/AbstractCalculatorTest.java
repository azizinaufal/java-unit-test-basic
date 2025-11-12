package programmer.zaman.now.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import programmer.zaman.now.test.resolver.RandomParameterResolver;

@ExtendWith(RandomParameterResolver.class)

public class AbstractCalculatorTest {
    protected Calculator calculator = new Calculator();

    @BeforeEach
    void setUp(){
        System.out.println("Befor Each");
    }
}
