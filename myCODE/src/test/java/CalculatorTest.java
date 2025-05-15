import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(8,Calculator.add(4,4));
    }
    @Test
    void information() {
        System.out.println("what is the sum of the two numbers?");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");
    }
    @

}
