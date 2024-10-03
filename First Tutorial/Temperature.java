import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input temperature in celsius: ");
        float tempC = input.nextFloat();
        float temF = (tempC * 9/5) + 32;
        System.out.println(temF);
    }
}
