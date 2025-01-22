public class university {
    public static void main(String[] args) {
        double fee = 125000;
        double disP = 10;
        double dis = fee * disP / 100;
        double disFee = fee - dis;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + disFee);
    }
}
