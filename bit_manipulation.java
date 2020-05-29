
public class bit_manipulation {
    public static void main(String[] agrs) {
        System.out.println(12 >> 2);
        System.out.println(-12 >> 2);

        System.out.println(-12 >>> 2);

        // when considering the number is odd or even, using & operator
        // to judge the first bit is 0 or 1 
        int number = 12;
        if((number & 1) == 0) {
            System.out.println("number is even");
        }
        
        // when swaping two numbers, don't need the temporary variable
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + " " + "b:" + b);

        // using bit manipulation
        // a ^ a = 0,  a ^ 0 = a,  (a ^ b) ^ c = a ^ (b ^ c)
        int c = 1;
        int d = 2;
        c ^= d;
        d ^= c;
        c ^= d;
        System.out.println("a:" + a + " " + "b:" + b);

        // modules algorithms: X & (2^N-1) == X % N
        int e = 33;
        System.out.println(e % 16);
        System.out.println(e & 15);

        // get the absolute value.
        int f = -34;
        if (f >> 31 == 0) {
            System.out.println(f);
        } else {
            System.out.println((~f+1));
        } 
        // get the 19,  % get the single digit, / get the tens digit 
        System.out.println(19 % 10);
        System.out.println(19 / 10);

    }
    
}