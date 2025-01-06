public class CastingDemo {
    public static void main(String[] args) {

        // Convert double to int (Explicit downcast)
        double theDoubleAverage = 89.90;
        int theIntAverage = (int) theDoubleAverage;

        System.out.println("The double grade average = "+theDoubleAverage);  // output = 89.90
        System.out.println("The int grade average = "+theIntAverage); // output = 89 (data loss/truncation)

        //Convert float to byte
        float theFloatDistance = 123.56f;
        byte theByteDistance = (byte) theFloatDistance;

        System.out.println("The float Distance = "+ theFloatDistance);
        System.out.println("The byte Distance = "+ theByteDistance);

        // Convert int to the char
        int theIntCode = 66;
        char theChar = (char) theIntCode;

        System.out.println("The Int code = "+ theIntCode);
        System.out.println("The Character code = "+ theChar);

        // Convert String to int
        int count = Integer.parseInt("89");
        // Integer is a wrapper class with its utility method .parseInt
        System.out.println("count ="+count);

        // Because "Crazy" is not a valid Integer
//        int value = Integer.("crazy");
//        System.out.println("value ="+value);

    }
}
