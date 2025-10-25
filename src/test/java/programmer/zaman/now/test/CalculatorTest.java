package programmer.zaman.now.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess(){
        var result=calculator.add(10,10);
        Assertions.assertEquals(20,result);
    }

    @Test
    public void testDivideSuccess(){
        var result = calculator.divide(100,10);
        Assertions.assertEquals(10,result);
    }

    @Test
    public void testDivideFailed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
           calculator.divide(10,0);
        });
    }
}
