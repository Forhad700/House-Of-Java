import java.util.Scanner;

public class Return_string {
    public static void main(String[] args) {
        // String st = dis();
        // System.out.println(st);

        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        String st = input.next();
        String ans = dis2(st);
        System.out.println(ans);
    }


    static String dis2(String s){
        String res = "Hello, " + s;
        return res;
    }


    static String dis(){
        String str = "Hello, world!";
        return str;
    }
}
