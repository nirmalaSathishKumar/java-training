public class VariablesTypes {
    float f = (float)3.5;
    float f1 = 4.5f; // (f is a shorter way of casting float)
     public static void main(String[] arg){
        String s1 = "This is a big number";
        String s2 = "my name could be small";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

                /*Create all of the primitives (except long and double) with different values. 
        Concatenate them into a string and print it to the screen so it will print:
         H3110 w0r1d 2.0 true*/

            String s4 = "3110";
            int n2 = 0;
            double d = 2.0;
            char c = 'H';
            char b = 'w';
            boolean g = true;
            String b2 ="rld";
            String newString = c+s4+" "+b+n2+b2+" "+d+" "+g;
            System.out.println(newString);
    }

}
