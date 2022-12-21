package practice_assignment.services;

public class DisplayOrder {

    public void displayInAscendingOrder(double[] sharePrice) {
        System.out.println("Stock prices in ascending order are: ");
        for(double price : sharePrice) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public void displayInDescendingOrder(double[] sharePrice) {
        System.out.println("Stock prices in descending order are: ");
        for(int i = sharePrice.length - 1; i >= 0; i--) {
            System.out.print(sharePrice[i] + " ");
        }
        System.out.println();
    }
}
