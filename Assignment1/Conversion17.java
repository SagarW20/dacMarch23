public class Conversion17 {
    public static void main(String args[]){
        //integer instance
        int n1 = 76871247;
        Integer intInstance = new Integer(n1);

        //into byte
        byte b1 = intInstance.byteValue();
        System.out.println("Byte value: "+ b1);

        //into short
        short s1 = intInstance.shortValue();
        System.out.println("Short value: "+ s1);

        //into int
        int i = intInstance.intValue();
        System.out.println("Integer value: "+ i);

        //into long
        long l1 = intInstance.longValue();
        System.out.println("Long value: "+ l1);

        //into float
        float f1 = intInstance.floatValue();
        System.out.println("Float value: "+ f1);

        //into double
        double d1 = intInstance.doubleValue();
        System.out.println("Double value: "+ d1);

    }
}
