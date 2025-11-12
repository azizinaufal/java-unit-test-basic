package programmer.zaman.now.test;

import org.junit.jupiter.api.*;


import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorTest {

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a+b;
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Tes Random Calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a+b;
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Tes Random Calculator")
    @RepeatedTest(value = 10, name = "{displayName}")
    void testRandomRepeatInfo(Random random, RepetitionInfo repetitionInfo, TestInfo info) {
        var a = random.nextInt();
        var b = random.nextInt();

        System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions() );

        var result = calculator.add(a, b);
        var expected = a+b;
        Assertions.assertEquals(expected, result);
    }
}
