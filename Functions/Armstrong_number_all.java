public class Armstrong_number_all {
    public static void main(String[] args) {
        for(int i=100; i<=1000; i++){
            if(armstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean armstrong(int x){
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
