public class Conversion11 {
    public static void main(String args[]){
        // extracting the argument
        char c = args[0].charAt(0);

        // checking whether digit or character
        if (Character.isDigit(c)){
            System.out.println(Integer.parseInt(args[0]));
        }else{
            if (Character.isLowerCase(c)){
                System.out.println(Character.toUpperCase(c));
            } else if(Character.isUpperCase(c)){
                System.out.println(Character.toLowerCase(c));
            }else{
                System.out.println("Not an alphabet, neither a digit!");
            }
            
            // System.out.println(c);
        }

        // checking whether uppercase or lowercasse


        
    }
}
