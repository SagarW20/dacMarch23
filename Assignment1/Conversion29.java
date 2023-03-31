public class Conversion29 {
    public static void main(String args[]){
        //double instance to byte
        double d1 = 797539889629.8752;
        Double d = Double.valueOf(d1);

        System.out.println("byte value: "+d.byteValue());

        //double instance to short 
        System.out.println("short value: "+d.shortValue());

        //double instance to int 
        System.out.println("integer value: "+d.intValue());

        //double instance to long 
        System.out.println("long value: "+d.longValue());

        //double instance to float
        System.out.println("float value: "+d.floatValue());

        //double instance to double
        System.out.println("double value: "+d.doubleValue());
    }
}
