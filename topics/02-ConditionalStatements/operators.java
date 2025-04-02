public class operators {
    public static void main(String[] arg){
        int a = 4;
        int b = 5;
        if (a == 4) {
        System.out.println("Simple if to check a is 4!");
        }
        //Boolean operators
        boolean result;
        result = a < b; // true
        System.out.println(result);
        int a1 = 4;
        int b1 = 5;
        result = a1 > b1; // false
        System.out.println(result);
        int a3 = 4;
        result = a3 <= 4; // a smalle;r or equal to 4 - true
        System.out.println(result);
        int b3 = 5;
        result = b3 >= 6; // b bigger or equal to 6 - false
        System.out.println(result);
        int a4 = 4;
        int b4 = 5;
        result = a4 == b4; // a equal to b - false
        System.out.println(result);
        int a5 = 4;
        int b5 = 5;
        result = a5 != b5; // a is not equal to b - true
        System.out.println(result);
        int a6 = 4;
        int b6 = 5;
        result = a6 > b6 || a6 < b6; // Logical or - true
        System.out.println(result);
        int a7 = 4;
        result = 3 < a7 && a7 < 6; // Logical and - true
        System.out.println(result);
        result = !result; // Logical not - false
        System.out.println(result);
}
}