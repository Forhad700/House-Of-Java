public class FunctionOverloading {
    public static void main(String[] args) {
        fun(10);
        fun(20, 30);
        fun("Forhad Hosen");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a, int b){
        System.out.println(a + " " + b);
    }

    static void fun(String st){
        System.out.println(st);
    }
}
