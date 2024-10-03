import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = check(n);
        System.out.println(ans);
    }

    static boolean check(int x){
        int original = x;
        int sum = 0;

        while(x>0){
            int rem = x%10;
            x = x/10;
            sum = sum + rem*rem*rem;
        }
        
        return sum==original;
    }
}
