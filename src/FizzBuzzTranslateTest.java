import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void traslatecase1() {
        int number = 3;
        String result = FizzBuzzTranslate.traslate(number);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    void traslatecase2() {
        int number = 5;
        String result = FizzBuzzTranslate.traslate(number);
        String expected = "Buzz";
        assertEquals(expected, result);
    }
    @Test
    void traslatecase3() {
        int number = 15;
        String result = FizzBuzzTranslate.traslate(number);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }
    @Test
    void traslatecase4() {
        int number = 16;
        String result = FizzBuzzTranslate.traslate(number);
        String expected = "number = " + number;
        assertEquals(expected, result);
    }
    @Test
    void traslatecase5() {
        int number = 0;
        String result = FizzBuzzTranslate.traslate(number);
        String expected = "Không phải số lớn hơn 0";
        assertEquals(expected, result);
    }
    @Test
    void traslatecase6() {
        int number = -1;
        String result = FizzBuzzTranslate.traslate(number);
        String expected = "Không phải số lớn hơn 0";
        assertEquals(expected, result);
    }
}