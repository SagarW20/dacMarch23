public class Conversion14 {
    public static void main(String args[]){
        short st = 435;
        Short st1 = new Short((st));
        
        System.out.println("Byte Value: "+st1.byteValue());
        System.out.println("Short Value: "+st1.shortValue());
        System.out.println("Int Value: "+st1.intValue());
        System.out.println("Long Value: "+st1.longValue());
        System.out.println("Float Value: "+st1.floatValue());
        System.out.println("Double Value: "+st1.doubleValue());
    }
}
