public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //use wrapper class to display max and min values
        System.out.println("byte min value = " + Byte.MIN_VALUE);
        System.out.println("byte max value = " + Byte.MAX_VALUE);
        System.out.println("int max value = " + Integer.MAX_VALUE);
        System.out.println("int min value = " + Integer.MIN_VALUE);
        System.out.println("short min value = " + Short.MIN_VALUE);
        System.out.println("short max value = " + Short.MAX_VALUE);
        System.out.println("long min value = " + Long.MIN_VALUE);
        System.out.println("long max value = " + Long.MAX_VALUE);
        System.out.println("float min value = " + Float.MIN_VALUE);
        System.out.println("float max value = " + Float.MAX_VALUE);
        System.out.println("double min value = " + Double.MIN_VALUE);
        System.out.println("double max value = " + Double.MAX_VALUE);


        // these values are outside the range of the primitive data type
        // this results in compilation error
        /*  byte otherValue = 129;
            short otherNum = 33000;
            int otherCount= 2147483648;
         */


        float interRate = 7.95f;
        double prizeWinning = 998234252.45;

        System.out.println("interestRate= " + interRate);
        System.out.println("prizeWinning= " + prizeWinning);    // output prizeWinning= 9.9823425245E8 (Scientific e-notation)



        /*
        Format floating point numbers
        %.2f number should be formatted as a (f) floating point number
        with (2) digits to right of the decimal point
         */

        String formattedNum = String.format("%.2f", prizeWinning);
        System.out.println("Formatted prizeWinning: "+ formattedNum); //get output as expected




    }
}