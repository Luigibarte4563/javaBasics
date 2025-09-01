public class PaymentCalculator {
    public static void main(String[] args) {
        // Given data
        double totalPriceBeforeDiscount = 1450.75;
        double discountPrice = 1378.2125;
        double finalPriceAfterTax = 1543.5980000000002;
        char paymentType = 'C'; // Assuming 'C' means Cash or Credit card
        char paymentType2 = 'D'; // this is Debit card
        
        // Calculating discount rate
        double discountRate = (totalPriceBeforeDiscount - discountPrice) / totalPriceBeforeDiscount;
        
        // Calculating tax rate based on price after discount
        double taxRate = (finalPriceAfterTax - discountPrice) / discountPrice;
        
        // Display results
        System.out.printf("Total price before discount: Php%.2f\n", totalPriceBeforeDiscount);
        System.out.printf("Price after discount: Php%.2f\n", discountPrice);
        System.out.printf("Final price after tax: Php%.2f\n", finalPriceAfterTax);
        System.out.println("Payment type: " + (paymentType == 'C' ? "Cash or Credit Card" : "Other"));
        System.out.println("Thank you for shopping with us!");
    }
}