public class Conversion13 {
    public static void main(String args[]){
        Short S = new Short((short) 23);
        short st = 234;

        System.out.println("Into String: "+S.toString());
        // System.out.println(S);

        //Short instance from short value
        Short shortInstance = new Short(st);
        System.out.println(shortInstance);

        //String instance to short instance
        String str = new String();
        str = "101";
        Short shortInstance2 = new Short(str);
        
        System.out.println(shortInstance2);


    }
}
