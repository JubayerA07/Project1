import java.util.Scanner;
import java.text.DecimalFormat;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Formatting Values to match dollars
        DecimalFormat df_obj = new DecimalFormat("#.##");


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

        double preTip = preTotal * Percent/100.0;
        double Tip1 = Math.round(preTip * 100.0) / 100.0;;

        //Calculating Total Bill
        double TipAndBill = preTotal + Tip1;
        double TotalBill = Math.round(TipAndBill * 100.0) / 100.0;

        //Calculating Tip/Person
        double TipPer = Tip1 / people;
        double TotalTipPer = Math.round(TipPer * 100.0) / 100.0;

        //Calculating total per person
        double BillPer = TotalBill / people;
        double TotalBillPer = Math.round(BillPer * 100.0) / 100.0;






        System.out.println();
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("|Total Tip Amount: " + "$"+String.format("%.2f", Tip1)+"      |");
        System.out.println("--------------------------------");
        System.out.println("|Total bill cost: " + "$"+String.format("%.2f", TotalBill)+"      |");
        System.out.println("--------------------------------");
        System.out.println("|Tip per person: " + "$"+String.format("%.2f", TotalTipPer)+"        |");
        System.out.println("--------------------------------");
        System.out.println("|Total bill per person: " + "$"+String.format("%.2f", TotalBillPer)+" |");
        System.out.println("--------------------------------");






    }
}