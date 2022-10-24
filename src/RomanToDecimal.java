/**
 * @author 24scurria
 * @version 10.7.22
 * Takes a roman numeral and turns it into a decimal value
 */
public class RomanToDecimal {
    /**
     * checks the characters and outputs a decimal value for each character, and handles invariants
     * @param roman
     * @return
     */
    public static int romanToDecimal(String roman)  {
        // parse roman letter by letter
        // find raw point value based on letter
        // sum point values
        // return decimal value of roman
        // "XI" ==> 11 or "XI".length() = 2
        // "IV" ==> 6
        // "MCMLXII".length() = 7
        // 0123456
        // "HAHA" = -1
        // string.length()
        // array.length
        // list.size()
        int sum = 0;
        // convert to all one case
        roman = roman.toUpperCase();
        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'I')
                sum += 1;
            else if(roman.charAt(i) == 'V')
                sum += 5;
            else if(roman.charAt(i) == 'X')
                sum += 10;
            else if(roman.charAt(i) == 'L')
                sum += 50;
            else if(roman.charAt(i) == 'C')
                sum += 100;
            else if(roman.charAt(i)== 'D')
                sum += 500;
            else if(roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;
        }
        // invariants
        if(roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }


    private static String decimalToRoman(int decimal) {
       String roman = "";
        while (decimal >= 1000) {
            roman += "M";
            decimal -= 1000;
        }
        while (decimal >= 900) {
            roman += "CM";
            decimal -= 900;
        }
        while (decimal >= 500) {
            roman += "D";
            decimal -= 500;
        }
        while (decimal >= 400) {
            roman += "CD";
            decimal -= 400;
        }
        while (decimal >= 100) {
            roman += "C";
            decimal -= 100;
        }
        while (decimal >= 90) {
            roman += "XC";
            decimal -= 90;
        }
        while (decimal >= 50) {
            roman += "L";
            decimal -= 50;
        }
        while (decimal >= 40) {
            roman += "XL";
            decimal -= 40;
        }
        while (decimal >= 10) {
            roman += "X";
            decimal -= 10;
        }
        while (decimal >= 9) {
            roman += "IX";
            decimal -= 9;
        }
        while (decimal >= 5) {
            roman += "V";
            decimal -= 5;
        }
        while (decimal >= 4) {
            roman += "IV";
            decimal -= 4;
        }
        while (decimal >= 1) {
            roman += "I";
            decimal -= 1;
        }
        return roman;
    }


    /**
     * main method of RomanToDecimal
     * @param args command line arguments if needed
     */
    public static void main(String[] args) {
        for(String roman : args)    { // for-each loop
            int decimal = romanToDecimal(roman);
            if(decimal != -1) {
                if (roman.toUpperCase().equals(decimalToRoman(decimal)))
                    System.out.println("Input: " + roman + " => output " + decimal);
                else
                    System.out.println("Input: " + roman + " => the output: " + decimal + " is logically incorrect");
            }
            else
                System.out.println("Input: " + roman + " => output: invalid");
        }
    }
}
