public class Meeting {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.4 to access the link).

        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int salesInt = (int)sales;
        int profitInt = (int)profit;
        int refundsInt = (int)refunds;
        int shippingInt = (int)shipping;

        System.out.println("This month, we made $" + salesInt + " in sales");
        System.out.println("Factoring in costs, we made $" + profitInt + " in profit");
        System.out.println("The refunds are at a low $" + refundsInt + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + shippingInt + " in shipping");


    }
}
