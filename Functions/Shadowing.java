public class Shadowing {
    static int a = 10;
    public static void main(String[] args) {
        System.out.println(a);

        int a = 20;
        System.out.println(a);

        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
