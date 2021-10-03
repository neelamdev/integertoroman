import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RomanToIntegerTest {
    @Test
    public void unitsRomanToInteger() {
        //arrange
        RomanToInteger myRomanToInteger = new RomanToInteger();
        //act
        int result1 = myRomanToInteger.convertToInteger("I");
        int result2 = myRomanToInteger.convertToInteger("II");
        int result3 = myRomanToInteger.convertToInteger("IX");
        //assert

        assertEquals(result1,1);
        assertEquals(result2,2);
        assertEquals(result3,9);

    }


    @Test
    public void tensRomanToInteger() {
        //arrange
        RomanToInteger myRomanToInteger = new RomanToInteger();
        //act
        int result1 = myRomanToInteger.convertToInteger("XCIX");
        int result2 = myRomanToInteger.convertToInteger("XLIX");
        //assert
        assertEquals(result1,99);
        assertEquals(result2,49);

    }


    @Test
    public void hundredsRomanToInteger() {
        //arrange
        RomanToInteger myRomanToInteger = new RomanToInteger();
        //act
        int result1 = myRomanToInteger.convertToInteger("CI");
        int result2 = myRomanToInteger.convertToInteger("CMXCIX");
        //assert
        assertEquals(result1,101);
        assertEquals(result2,999);


    }

    @Test
    public void thousandsRomanToInteger() {
        //arrange
        RomanToInteger myRomanToInteger = new RomanToInteger();
        //act
        int result1 = myRomanToInteger.convertToInteger("M");
        int result2 = myRomanToInteger.convertToInteger("MMM");
        //assert
        assertEquals(result1,1000);
        assertEquals(result2,3000);


    }


}
