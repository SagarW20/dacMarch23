public class Conversion21 {
    public static void main(String args[]){
        long l = 7397531969l;
        Long l1 = Long.valueOf(l);

        //long instance to byte
        System.out.println("byte value: "+l1.byteValue());

        //long instance to short
        System.out.println("short value: "+l1.shortValue());

        //long instance to int
        System.out.println("integer value: "+l1.intValue());

        //long instance to long
        System.out.println("long value: "+l1.longValue());

        //long instance to double
        System.out.println("double value: "+l1.doubleValue());

        //long instance to float
        System.out.println("float value: "+l1.floatValue());
    }
}
