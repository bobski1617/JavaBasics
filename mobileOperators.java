import java.util.Scanner;

public class mobileOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String duration = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String mobileData = scanner.nextLine();
        int monthsToPay = Integer.parseInt(scanner.nextLine());

        double mobileDataPrice = 0;
        double monthlyBill = 0;

        switch (duration) {
            case "one":
                double small = 9.98;
                double middle = 18.99;
                double large = 25.98;
                double extraLarge = 35.99;

                if (typeContract.equals("Small")) {
                    mobileDataPrice = 5.5;
                    monthlyBill = small;

                } else if (typeContract.equals("Middle")) {
                    mobileDataPrice = 4.35;
                    monthlyBill = middle;

                } else if (typeContract.equals("Large")) {
                    mobileDataPrice = 4.35;
                    monthlyBill = large;
                } else {
                    mobileDataPrice = 3.85;
                    monthlyBill = extraLarge;
                }
                break;

            case "two":

                double smallTwo = 8.58;
                double middleTwo = 17.09;
                double largeTwo = 23.59;
                double extraLargeTwo = 31.79;

                if (typeContract.equals("Small")) {
                    if (mobileData.equals("yes")){
                        mobileDataPrice = 5.5;

                    }
                    monthlyBill = smallTwo;

                } else if (typeContract.equals("Middle")) {
                    if (mobileData.equals("yes")){
                    mobileDataPrice = 4.35;

                    }
                    monthlyBill = middleTwo;

                } else if (typeContract.equals("Large")) {
                    if (mobileData.equals("yes")){

                    mobileDataPrice = 4.35;
                    }
                    monthlyBill = largeTwo;
                } else {
                    if (mobileData.equals("yes")){

                    mobileDataPrice = 3.85;
                    }
                    monthlyBill = extraLargeTwo;
                }

                break;
        }



        if (duration.equals("one")){

        double totalPrice = (mobileDataPrice + monthlyBill) * monthsToPay;
        System.out.printf("%.2f lv.", totalPrice);
        } if (duration.equals("two")){
            double totalPrice = (mobileDataPrice + monthlyBill) * monthsToPay;
            System.out.printf("%.2f lv.", totalPrice * 0.9625);
        }


    }
}
