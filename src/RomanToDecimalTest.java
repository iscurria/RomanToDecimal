import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        // 10 valid
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("M"), 1000);
        assertEquals(RomanToDecimal.romanToDecimal("CD"), 400);
        assertEquals(RomanToDecimal.romanToDecimal("DCL"), 650);
        assertEquals(RomanToDecimal.romanToDecimal("XIX"), 19);
        assertEquals(RomanToDecimal.romanToDecimal("DI"), 501);
        assertEquals(RomanToDecimal.romanToDecimal("MMMCCC"), 3300);
        assertEquals(RomanToDecimal.romanToDecimal("CDLXI"), 461);
        assertEquals(RomanToDecimal.romanToDecimal("cxviii"), 118);
        assertEquals(RomanToDecimal.romanToDecimal("xcl"), 140);

        // 4 logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("XVVVI"), 26);
        assertEquals(RomanToDecimal.romanToDecimal("CCCCCCCCCC"), 1000);
        assertEquals(RomanToDecimal.romanToDecimal("DCLL"), 700);
        assertEquals(RomanToDecimal.romanToDecimal("XXXXVV"), 50);
        assertEquals(RomanToDecimal.romanToDecimal("IVIV"), 10);

        // 4 invalid
        assertEquals(RomanToDecimal.romanToDecimal("haha"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Issie"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("grace"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("scurria"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("I X"), -1);

        // 2 assertNotEquals
        assertNotEquals(RomanToDecimal.romanToDecimal("your mom"), 100);
        assertNotEquals(RomanToDecimal.romanToDecimal("XI"), 12);
    }
}