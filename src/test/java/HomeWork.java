import org.junit.jupiter.api.Test;

public class HomeWork {

    @Test

    public void homework1() {
        String stringToCount = "    Midsummer madness      in Latvia   ";

        countCharacters(stringToCount);

        calculateLoanAmount();
    }

    public void countCharacters(String stringToCount) {
//        String stringToCount = "    Midsummer madness      in Latvia   ";

        int count = stringToCount.length();
        System.out.println("Total number of characters in a string: " + count);

        // cut off leading and trail spaces
        stringToCount = stringToCount.trim();
        System.out.println("Leading and trail spaces removed: " + stringToCount);

        // remove space after space...
        stringToCount = stringToCount.replaceAll("[ ]{2,}", " ");
        System.out.println(stringToCount + "<---");

        // calculate spaces +1
        int wordCount = stringToCount.length() - (stringToCount.replaceAll(" ", "").length()) + 1;

        System.out.println("Word count: " + wordCount);
    }


    public void calculateLoanAmount() {

        double principalAmount = 50000.00;
        double rate = 3.00;
        int time = 15;

        double interest = (principalAmount * rate * time) / 100;

        double totalLoanAmount = principalAmount + interest;

        System.out.println("Principal loan amount is " + principalAmount);

        System.out.println("If principal amount is " + principalAmount + " and interest rate is " + rate +
                " per annum, " +
                "interest over " + time + " years is " + interest);

        System.out.println("Total loan amount is " + totalLoanAmount);
    }
}
