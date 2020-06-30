public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1year = service.calculate (1_000_000, 9.99, 12);
        System.out.printf("Ежемесячный платеж составит %.0f\n", monthlyPayment1year);

        double monthlyPayment2year = service.calculate (1_000_000, 9.99, 24);
        System.out.printf("Ежемесячный платеж составит %.0f\n", monthlyPayment2year);

        double monthlyPayment3year = service.calculate (1_000_000, 9.99, 36);
        System.out.printf("Ежемесячный платеж составит %.0f\n", monthlyPayment3year);
    }
}
