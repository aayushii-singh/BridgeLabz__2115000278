public class profit_loss {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.printf(
                "The Cost Price is INR %.2f and Selling Price is INR %.2f\n" +
                        "The Profit is INR %.2f and the Profit Percentage is %.2f%%",
                costPrice, sellingPrice, profit, profitPercentage );

}
}