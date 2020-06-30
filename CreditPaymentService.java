public class CreditPaymentService {
    public double calculate (int creditAmount, double rate, int term) {
        double ratePerMonth = rate/100/12;
        double exponent = Math.pow(1 + ratePerMonth, term);
        double annuityRatio = ratePerMonth * exponent / (exponent - 1);
        double monthlyPayment = creditAmount * annuityRatio;
        return monthlyPayment;
    }
}
