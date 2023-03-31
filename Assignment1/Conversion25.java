public class Conversion25{
    public static void main(String args[]){
        float f1 = 875.88f;
        Float f = Float.valueOf(f1);

        //float instance to byte
        System.out.println("float instance to byte: "+ f.byteValue());

        //float instance to short
        System.out.println("float instance to short: "+ f.shortValue());

        //float instance to int
        System.out.println("float instance to int: "+ f.intValue());

        //float instance to long
        System.out.println("float instance to long: "+ f.longValue());

        //float instance to float
        System.out.println("float instance to float: "+ f.floatValue());

        //float instance to double
        System.out.println("float instance to double: "+ f.doubleValue());
    }
}