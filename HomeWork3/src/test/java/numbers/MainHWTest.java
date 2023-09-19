package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {

    MainHW mainHW = new MainHW();

    @Test
    void evenOddNumberTrue() {
        assertTrue(mainHW.evenOddNumber(44));
    }

    @Test
    void evenOddNumberFalse() {
        assertFalse(mainHW.evenOddNumber(13));
    }

    @Test
    void numberInIntervalTrue() {
        assertTrue(mainHW.numberInInterval(25));
    }

    @Test
    void numberInIntervalFalse() {
        assertFalse(mainHW.numberInInterval(105));
    }

}
