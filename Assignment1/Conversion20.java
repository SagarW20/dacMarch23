public class Conversion20 {
    public static void main(String args[]){
        long l = 37949919755l;
         
        //to string 
        String st = Long.toString(l);
        System.out.println(st);

        //to long instance
        Long l1 = Long.valueOf(l);
        // System.out.println(l1);

        //string instance to long instance
        String s = "73745986"; 
        String s1 = String.valueOf(l);
        Long l2 = Long.valueOf(s1);
        System.out.println("Long instance value: "+ l2);


        //long to binary 
        System.out.println("Binary string: "+Long.toBinaryString(l));

        //long to octal
        System.out.println("Octal string: "+Long.toOctalString(l));

        //long to hexadecimal 
        System.out.println("Hex string: "+Long.toBinaryString(l));


    }
}
