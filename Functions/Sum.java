import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        int result = sum_return();
        System.out.println("Sum of two number is: " + result);
    }

    static int sum_return(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number 1: ");
        int a = input.nextInt();
        System.out.print("Input Number 2: ");
        int b = input.nextInt();
        int res = a+b;
        return res;
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number 1: ");
        int a = input.nextInt();
        System.out.print("Input Number 2: ");
        int b = input.nextInt();
        int res = a+b;
        System.out.println("Sum of two number is: " + res);
        input.close();
    }
    
}
