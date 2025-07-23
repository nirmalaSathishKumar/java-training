public class methodOverload {
    public static int sum (int a, int b){
        int sum11 = a + b ;
        return sum11;
    }

    public static double sum (double c, double d){
        double sum12 = c + d ;
        return sum12;
    }
    public static void main(String[] arg){
        int sum1 = sum (4,5);
        double sum2 = sum (2.3,4.5);
        System.out.println("Int Sum: "+sum1);
        System.out.println("Double sum : " +sum2);

    }
    
}
