import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 45535;
        int x = input.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==x){
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
        input.close();
    }
}
