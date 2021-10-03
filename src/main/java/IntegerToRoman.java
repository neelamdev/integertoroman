public class IntegerToRoman {

    public String convertToRoman(int number) {

        String []units ={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String []tens ={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String []hundreds ={"","C","CC","CCC","DC","D","DC","DCC","DCCC","CM"};
        String []thousands  ={"","M","MM","MMM"};

       return thousands[(number/1000)]+hundreds[(number%1000)/100]+tens[(number%100)/10]+units[number%10];

    }
}
