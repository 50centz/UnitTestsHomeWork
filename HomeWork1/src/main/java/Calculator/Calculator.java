package Calculator;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        double discount = (purchaseAmount * discountAmount) / 100;

        return purchaseAmount - discount;
    }
}
