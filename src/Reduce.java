public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int ans = 0;

        while(n > 0){
            if(n % 2 == 0){ n = n / 2; ans++; }
            else { n = n - 1; ans++; }
        }
        System.out.println(ans);
    }
}
