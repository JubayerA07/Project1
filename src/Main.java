import java.util.Scanner;
import java.util.*;
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
        double rounding = Math.round(preTip * 100.0) / 100.0;
        String Tip = ("" + rounding) + "0";
        double TotalTip = Double.parseDouble(Tip);

        //Calculating Total Bill
        double TipAndBill = preTotal + TotalTip;
        double roundingTotal = Math.round(TipAndBill * 100.0) / 100.0;
        String TotalBill = ("" + roundingTotal) + "0";
        double totalTip = Double.parseDouble(TotalBill);



        System.out.printf("%.2f", TotalTip);
        System.out.println();
        System.out.printf("%.2f", totalTip);




    }
}