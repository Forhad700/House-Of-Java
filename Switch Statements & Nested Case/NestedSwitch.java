import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String dept = input.next();

        switch(empID){
            case 1:
                System.out.println("Forhad");
                break;
            case 2:
                System.out.println("Hosen");
                break;
            case 3:
                System.out.println("Employee ID 3");
                switch (dept) {
                    case "cs":
                        System.out.println("Computer Science");
                        break;
                    case "ai":
                        System.out.println("Artificial Intelligence");
                        break;
                    default:
                        System.out.println("No Department Exist");
                }
                break;
            default:
                System.out.println("Invalid Input");
        }


        // switch (empID) {
        //     case 1 -> System.out.println("Forhad");

        //     case 2 -> System.out.println("Hosen");

        //     case 3 -> {
        //         System.out.println("Employee ID 3");
        //         switch (dept) {
        //             case "cs" -> System.out.println("Computer Science");
        //             case "ai" -> System.out.println("Artificial Intelligence");
        //             default -> System.out.println("No Department Exist");
        //         }
        //     }
        //     default -> System.out.println("Invalid Input");
        // }

        input.close();
    }
}
