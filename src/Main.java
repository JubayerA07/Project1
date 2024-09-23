import java.util.Scanner;
import java.util.*;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter Bill
        System.out.println("Enter your Bill($): ");
        double preTotal = input.nextDouble();

        //Enter Tip Percentage
        System.out.println("Tip Percent:");
        int Percent = input.nextInt();

        //Enter Number of people
        System.out.println("Number of People:");
        int people = input.nextInt();

        //Calculating Tip

        double preTip = preTotal * Percent/100;
        double rounding =  Math.round(preTip * 100.0) / 100.0;
        double Tip = 0.01 * floor(rounding * 100.0);

        //Calculating Total Bill
        double TipAndBill = preTotal + Tip;
        double roundingTotal = Math.round(TipAndBill * 100.0) / 100.0;
        String TotalBill = ("" + roundingTotal) + "0";
        double totalt = Double.parseDouble(TotalBill);

        //Calculating Tip/Person
        double TipPer = Tip / people;
        double roundingTipPer = Math.round(TipPer * 100.0) / 100.0;
        String TotalTipPer = ("" + roundingTipPer) + "0";
        double totalTipPer = Double.parseDouble(TotalTipPer);

        //Calculating total per person
        double BillPer = totalt / people;
        double roundingBillPer = Math.round(BillPer * 100.0) / 100.0;
        String TotalBillPer = ("" + roundingBillPer) + "0";
        double totalBillPer = Double.parseDouble(TotalBillPer);




        System.out.println(rounding);
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("|Total Tip Amount: " + "$");
        System.out.printf("%.2f", Tip);
        System.out.print("          |");
        System.out.println("--------------------------------");
        System.out.println("|Total bill cost: " + "$");
        System.out.printf("%.2f", totalt);
        System.out.print("          |");
        System.out.println("--------------------------------");
        System.out.println("|Tip per person: " + "$");
        System.out.printf("%.2f", totalTipPer);
        System.out.print("          |");
        System.out.println("--------------------------------");
        System.out.println("|Total bill per person: " + "$");
        System.out.printf("%.2f", totalBillPer);
        System.out.print("          |");
        System.out.println("--------------------------------");






    }
}