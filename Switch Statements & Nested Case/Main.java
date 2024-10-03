import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cricketers = input.next();

        // switch(cricketers){
        //     case "shakib":
        //         System.out.println("NO 1 All Rounder");
        //         break;
        //     case "tamim":
        //         System.out.println("Top Opener Batsman");
        //         break;
        //     case "taskin":
        //         System.out.println("Fast Bowler");
        //         break;
        //     case "miraj":
        //         System.out.println("Spin bowler");
        //         break;
        //     default:
        //         System.out.println("Enter Valid Input");
        // }

        switch (cricketers) {
            case "shakib" -> System.out.println("NO 1 All Rounder");
                
            case "tamim" -> System.out.println("Top Opener Batsman");
                
            case "taskin" -> System.out.println("Fast Bowler");
                
            case "miraj" -> System.out.println("Spin bowler");
                
            default -> System.out.println("Enter Valid Input");
        }

        

        // int day = input.nextInt();
        // switch (day) {
        //     case 1,2,3,4,5 -> System.out.println("Working Day");
        //     case 6,7 -> System.out.println("Weekend");
        // }


        input.close();
    }
}
