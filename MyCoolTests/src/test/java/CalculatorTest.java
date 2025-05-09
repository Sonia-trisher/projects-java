import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    @BeforeEach
    public void setUp() {
        System.out.println("Test setup");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Test teardown");
    }
    @Test
    void testAdd() {
        assertEquals(7,Calculator.add(3,4));
    }
    @Test
    void testAdd1() {
        assertEquals(13,Calculator.add(9,4));
    }
    @Test void testMethod1(){
        System.out.println("my first test method");
    }
    @Test void testMethod2(){
        System.out.println("my second test method");
    }

}
