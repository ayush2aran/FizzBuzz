public class Multiples {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int lmt = 1000;
        int c = a * b;
        int ans = 0;

        //adding multiples of a
        if(lmt % a != 0){ ans += (lmt / a); }
        else{ ans += ((lmt / a) - 1); }

        //adding multiples of b
        if(lmt % b != 0){ ans += (lmt / b); }
        else{ ans += ((lmt / b) - 1); }

        //subtracting multiples of c (common multiples of a and b)
        if(lmt % c != 0){ ans -= (lmt / c); }
        else{ ans -= ((lmt / c) - 1); }

        System.out.println(ans);
    }
}
