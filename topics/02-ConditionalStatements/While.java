public class While {
    public static void main(String[] arg){
        // Fibonacci series
        int a, b, c, i = 1, n;
        n = 10;
        a = b = 1;
        System.out.print("0 "+a+" "+b);

        while(i< n) {
            c = a + b;
            System.out.print(" ");
            System.out.print(c);
            a = b;
            b = c;
            i++;
        }

        }
    }
    
