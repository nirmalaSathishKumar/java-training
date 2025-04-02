public class ifElse {
    public static void main(String[] arg){
        int a = 4;
        if (a == 4) {
        System.out.println("Simple if to check a is 4!");
        }
        //Boolean operators
        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // true
        System.out.println(result)
        result = a > b; // false
        System.out.println(result)
        result = a <= 4; // a smaller or equal to 4 - true
        System.out.println(result)
        result = b >= 6; // b bigger or equal to 6 - false
        System.out.println(result)
        result = a == b; // a equal to b - false
        System.out.println(result)
        result = a != b; // a is not equal to b - true
        System.out.println(result)
        result = a > b || a < b; // Logical or - true
        System.out.println(result)
        result = 3 < a && a < 6; // Logical and - true
        System.out.println(result)
        result = !result; // Logical not - false
        System.out.println(result)
}
}