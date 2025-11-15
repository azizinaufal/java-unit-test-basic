package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

    @Timeout(value=5, unit= TimeUnit.SECONDS)
    @Test
    void slowTest1() throws InterruptedException {
        Thread.sleep(4_000);
    }
    @Timeout(value=5, unit= TimeUnit.SECONDS)
    @Test
    void slowTest2() throws InterruptedException {
        Thread.sleep(4_000);
    }
    @Timeout(value=5, unit= TimeUnit.SECONDS)
    @Test
    void slowTest3() throws InterruptedException {
        Thread.sleep(4_000);
    }
}
