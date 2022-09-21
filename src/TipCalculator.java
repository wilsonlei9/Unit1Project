import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Total bill: ");
        Double totalBill = s.nextDouble ();
        System.out.print("Tip percentage: ");
        Double tipPercentage = s.nextDouble ();
        double tipPercentageDecimal = tipPercentage/100;
        System.out.print("Number of people: ");
        int party = s.nextInt ();
        double totalTip = totalBill*tipPercentageDecimal;
        double totalBillWithTip = totalBill+totalTip;
        double tipPerPerson = totalTip/party;
        double totalPerPerson = totalBillWithTip/party;
        double roundTotalTip = (double)Math.round(totalTip*100)/100;
        System.out.println("Total tip: " + roundTotalTip);
        System.out.println("Total bill including tip: " + totalBillWithTip);
        System.out.println("Tip per person:" + tipPerPerson);
        System.out.println("Total per person:" + totalPerPerson);



    }
}
