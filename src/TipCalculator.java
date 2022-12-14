import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Asks user for total bill, tip percentage, and number of people
        System.out.print("Total bill: ");
        Double totalBill = s.nextDouble ();
        System.out.print("Tip percentage: ");
        Double tipPercentage = s.nextDouble ();
        double tipPercentageDecimal = tipPercentage/100;
        System.out.print("Number of people: ");
        int party = s.nextInt ();
        // Creates variables for tip, total bill with tip, tip per person, total per person
        double totalTip = totalBill*tipPercentageDecimal;
        double totalBillWithTip = totalBill+totalTip;
        double tipPerPerson = totalTip/party;
        double totalPerPerson = totalBillWithTip/party;
        // Rounds the variables
        double roundTotalTip = (double)Math.round(totalTip*100)/100;
        double roundTotalBillWithTip = (double)Math.round(totalBillWithTip*100)/100;
        double roundTipPerPerson = (double)Math.round(tipPerPerson*100)/100;
        double roundTotalPerPerson = (double)Math.round(totalPerPerson*100)/100;
        System.out.println("Total tip: $" + roundTotalTip);
        System.out.println("Total bill including tip: $" + roundTotalBillWithTip);
        System.out.println("Tip per person: $" + roundTipPerPerson);
        System.out.println("Total per person: $" + roundTotalPerPerson);

    }
}
