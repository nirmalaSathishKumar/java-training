public class IfElse {
    public static void main (String[] arg){
        int a = 4;
        int b = 5; 
        if (a == 4){
            System.out.println("It is 4");
        } else {
            System.out.println("it is 5");  
        }
        String result = b > a ? "B is big" : "A is big";
        System.out.println(result);
        // Odd or Even
        String value = a%2==0 ? "A is Even" : "A is odd";
        System.out.println(value);
        String value2 = b%2==0 ? "B is even" : "B is Odd";
        System.out.println(value2);
    }
}