import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Input Operator: ");
            char ch = input.next().trim().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.print("Input Two Numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                if(ch=='+'){
                    ans = a+b;
                }
                if(ch=='-'){
                    ans = a-b;
                }
                if(ch=='*'){
                    ans = a*b;
                }
                if(ch=='/'){
                    ans = a/b;
                }
                if(ch=='%'){
                    ans = a%b;
                }
            }
            else if(ch=='x' || ch=='X'){
                break;
            }
            else{
                System.out.println("Invalid");
            }

            System.out.println(ans);
        }
        
        input.close();
    }
}
