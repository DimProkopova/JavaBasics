import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());

        int numRam = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double totalPriceUsd = (processorPrice + videoCardPrice) * (1 - discount) + (ramPrice * numRam) ;
        double totalPriceLv = totalPriceUsd * 1.57;

        System.out.printf( "Money needed - %.2f leva.", totalPriceLv);
    }
}
