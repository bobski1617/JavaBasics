import java.util.Scanner;

public class safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fuelPrice = 2.1;
        double tripPrice = 100;

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelNeeded = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelNeededPrice = fuelPrice * fuelNeeded;
        double totalMoneyNeeded = tripPrice + fuelNeededPrice;
        double total = 0;
        if (day.equals("Saturday")){
            total = totalMoneyNeeded * 0.9;
        } else {
            total = totalMoneyNeeded * 0.8;
        }

        if (budget>=total){
            System.out.printf("Safari time! Money left: %.2f lv. ", budget - total);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget-total));
        }


    }
}
