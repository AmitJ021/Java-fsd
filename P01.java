package Practice;


public class P01 
{

    public static void main(String[] args) {

        int intValue = 10;
        long longValue = intValue; 

        System.out.println("Original int value: " + intValue);
        System.out.println("Implicitly converted long value: " + longValue);

        double doubleValue = 3.14;
        int narrowedInt = (int) doubleValue; 

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Explicitly narrowed int value (decimal part truncated): " + narrowedInt);

        float floatValue = 127.5f;
        byte narrowedByte = (byte) floatValue; 

        System.out.println("Original float value: " + floatValue);
        System.out.println("Explicitly narrowed byte value (may not be accurate): " + narrowedByte);
    }
}
