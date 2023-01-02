import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMealPrice = 10.35;
        double fishMealPrice = 12.40;
        double vegetarianPrice = 8.15;



        int chickenMeals = Integer.parseInt(scanner.nextLine());
        int fishMeals = Integer.parseInt(scanner.nextLine());
        int vegetarianMeals = Integer.parseInt(scanner.nextLine());

        double allChickenMeals = chickenMeals * chickenMealPrice;
        double allFishMeals = fishMeals * fishMealPrice;
        double allVegetarians = vegetarianMeals * vegetarianPrice;

        double allMeals = allChickenMeals + allFishMeals + allVegetarians;
        double desertPrice = allMeals * 0.2;
        double totalPrice = allMeals + desertPrice + 2.5; // 2.5 is a delivery price

        System.out.printf("Total: %.2f", totalPrice);

    }
}
