public class Conversion16 {
    public static void main(String args[]){
        //int value to string
        int n = 6586239;
        String st1 = Integer.toString((n));
        System.out.println(st1);

        //integer value to integer instance
        Integer intInstance = new Integer(n);
        System.out.println(intInstance);

        //String instance to Integer instance
        String st = "8518712";
        String stringInstance = new String(st);
        Integer intInstance2 = new Integer(stringInstance);
        System.out.println(intInstance2);

        //int value to binary string
        int n1 = 6976;
        System.out.println("Binary String: "+Integer.toBinaryString(n1));

        //int value to octal string
        System.out.println("Octal String: "+Integer.toOctalString(n1));

        //int value to hexadecimal string
        System.out.println("Hex String: "+Integer.toOctalString(n1));
    }
}
