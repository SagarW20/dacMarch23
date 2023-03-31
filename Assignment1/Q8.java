
public class Q8 {
    public static void main(String args[]){
        //byte value to string
        byte b = 23;
        String st = Byte.toString(b);
        System.out.println(st);

        //byte value to Byte instance
        byte b2 = 50;
        Byte byteInstance = Byte.valueOf(b2);
        System.out.println(byteInstance);

        //String instance into Byte instance
        String stringInstance = Byte.toString(b2);
        Byte b3 = Byte.valueOf(stringInstance);
        System.out.println(b3);

    }
    
}
