public class Conversion24 {
    public static void main(String args[]){
        float f = 67.36f;
        //float to string
        System.out.println(Float.toString(f));

        //float value to float instance
        Float f1 = Float.valueOf(f);

        //String instance to float instance
        String st = "823.34";
        String stringInstance = String.valueOf(st);
        Float floatInstance = Float.valueOf(stringInstance);

        System.out.println("floatInstance value: "+floatInstance);

        //float value to hexadecimal string
        System.out.println("float to hex string: "+ Float.toHexString(f));
    }
}
