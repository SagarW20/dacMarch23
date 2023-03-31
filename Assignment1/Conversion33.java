public class Conversion33 {
    public static void main(String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int res=0;
        switch (args[2]){
            case "+":
                res = (num1+num2);break;
            case "-":
                res = (num1 - num2);break;
            case "*":
                res = (num1 * num2);break;
            case "/":
                res = (num1/num2);break;

        }
        System.out.println(res);

    }
}
