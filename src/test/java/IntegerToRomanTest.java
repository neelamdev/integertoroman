import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class IntegerToRomanTest {
    @Test
    public void unitsIntegerToRoman() {
        //arrange
        IntegerToRoman myIntegerToRoman = new IntegerToRoman();
        //act
        String result1 = myIntegerToRoman.convertToRoman(1);
        String result2 = myIntegerToRoman.convertToRoman(2);
        String result3 = myIntegerToRoman.convertToRoman(9);
        //assert
        assertTrue(result1.equals("I"));
        assertTrue(result2.equals("II"));
        assertTrue(result3.equals("IX"));

    }


    @Test
    public void tensIntegerToRoman() {
        //arrange
        IntegerToRoman myIntegerToRoman = new IntegerToRoman();
        //act
        String result1 = myIntegerToRoman.convertToRoman(99);
        String result2 = myIntegerToRoman.convertToRoman(49);
        //assert
        assertTrue(result1.equals("XCIX"));
        assertTrue(result2.equals("XLIX"));

    }


    @Test
    public void hundredsIntegerToRoman() {
        //arrange
        IntegerToRoman myIntegerToRoman = new IntegerToRoman();
        //act
        String result1 = myIntegerToRoman.convertToRoman(101);
        String result2 = myIntegerToRoman.convertToRoman(999);
        //assert
        assertTrue(result1.equals("CI"));
        assertTrue(result2.equals("CMXCIX"));

    }

    @Test
    public void thousandsIntegerToRoman() {
        //arrange
        IntegerToRoman myIntegerToRoman = new IntegerToRoman();
        //act
        String result1 = myIntegerToRoman.convertToRoman(1000);
        String result2 = myIntegerToRoman.convertToRoman(3000);
        //assert
        assertTrue(result1.equals("M"));
        assertTrue(result2.equals("MMM"));

    }


}
