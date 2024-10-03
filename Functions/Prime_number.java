import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = check(n);
        System.out.println(ans);
    }

    static boolean check(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
