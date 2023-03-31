public class Conversion9 {
    public static void main(String args[]){
        //byte instance
        //Byte B = new Byte();
        Byte b = 23;

        //into byte
        byte b1 = b.byteValue();
        short s1 = b.shortValue();
        int i = b.intValue();
        long l = b.longValue();
        float f = b.floatValue();
        double d = b.doubleValue();


        System.out.println("Byte Value: "+b1);
        System.out.println("Short Value: "+s1);
        System.out.println("Integer Value: "+i);
        System.out.println("Long Value: "+l);
        System.out.println("Float Value: "+f);
        System.out.println("Double Value: "+d);


        // short sh = Byte.(b);
        // System.out.println(sh);
    }
}
