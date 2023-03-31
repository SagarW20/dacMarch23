public class Conversion28 {
    public static void main(String args[]){
        //double to String
        double d1 = 7397.977;
        System.out.println(Double.toString(d1));

        //double value to double instance
        Double doubleInstance = Double.valueOf(d1);

        //String instance into Double instance
        String s = "853897.962";
        String stringInstance = String.valueOf(s);
        Double doubleInstance2 = Double.valueOf(stringInstance);

        //double value into hexadecimal string
        System.out.println("hexadecimal string: "+Double.toHexString(d1));

        //double value into binary string
        long l = Double.doubleToLongBits(d1);
        String binaryString = Long.toBinaryString(l);
        System.out.println("binary string: "+binaryString);

        //double value into binary string
        String octalString = Long.toOctalString(l);
        System.out.println("octal string: "+octalString);


    }
}
