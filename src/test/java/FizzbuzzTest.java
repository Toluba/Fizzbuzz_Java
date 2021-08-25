import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    public void testGenerateListsNumbersUpToOne() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
    }
    @Test
    public void testGenerateReturnsFizz3() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(3);
        assertEquals("fizz", result);
    }

    @Test
    public void testGenerateReturnsBuzz5() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(5);
        assertEquals("buzz", result);
    }

    @Test
    public void testGenerateReturnsFizzbuzz15() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(15);
        assertEquals("fizzbuzz", result);
    }

}
