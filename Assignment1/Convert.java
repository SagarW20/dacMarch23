public class Convert {
    public static void main(String args[]){
        boolean b1 = true;

        //boolean value to string
        String c = Boolean.toString(b1);
        System.out.println(c);

        //boolean value to boolean instance
        boolean a = Boolean.valueOf(b1);
        System.out.println(a);

        //String value into boolean value
        String st = "cdac";
        boolean b2 = Boolean.parseBoolean(st);
        System.out.println(b2);

        boolean b3 = Boolean.valueOf(st);
        System.out.println(b3);
    }
    
}
