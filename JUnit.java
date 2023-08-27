package Esercizi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnit {
    public class Operations{
        public static int subtraction(int minuend, int subtrahend){
            return minuend - subtrahend;
        }

        public static int multiplication(int multiplier, int multiplicand){
            return multiplier * multiplicand;
        }
    }
    @Test
    void testSubtraction(){
        int result1 = Operations.subtraction(1, 1);
        int result2 = Operations.subtraction(2, 1);
        assertEquals(0, result1);
        assertEquals(1, result2);
    }
    @Test
    void  testMultiplication(){
        int result01 = Operations.multiplication(2,2);
        int result02 = Operations.multiplication(2, 3);
        assertEquals(4, result01);
        assertEquals(6, result02);
    }
}
