import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FibSeqTest {
    @Test
    public void testFibNthValueForZero() {
        int result = FibSeq.fibNthValue(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibNthValueForOne() {
        int result = FibSeq.fibNthValue(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibNthValueForTen() {
        int result = FibSeq.fibNthValue(10);
        assertEquals(55, result);
    }

    @Test
    public void testFibNthValueForLargeN() {
        int result = FibSeq.fibNthValue(20);
        assertEquals(6765, result);
    }


    @Test
    public void testFibNthValueForNegativeN() {
        // This test is supposed to fail because the method is not expected to handle negative values of n
        int result = FibSeq.fibNthValue(-5);
        assertEquals(-1, result); // This assertion will fail
    }

}
