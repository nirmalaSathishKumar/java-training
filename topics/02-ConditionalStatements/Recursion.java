public class Recursion {
    public static void main(String[] arg){
        int result = sum(10);
        System.out.println("Sum of 10 numbers is : " +result);
        int resultof2no = sumOf2no(5,10);
        System.out.println("Sum between two numbers : " +resultof2no);
    }
    static int sum(int a){
        if (a>0){
            System.out.println(a);
            return a + sum(a-1);
        } else {
            return 0;
        }
    }

    static int sumOf2no(int c, int d){
        if (d > c){
            System.out.println(d);
            return d + sumOf2no(c,d-1);
        } else {
            return c;
        }

    }
    
}
