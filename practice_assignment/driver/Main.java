package practice_assignment.driver;

import practice_assignment.services.BinarySearchImplementation;
import practice_assignment.services.DisplayOrder;
import practice_assignment.services.LinearSearchForProfit;
import practice_assignment.services.MergeSortImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;

        System.out.println("Enter the no of companies: ");
        int noOfCompany = in.nextInt(); //

        double[] sharePrice = new double[noOfCompany];
        boolean[] profit = new boolean[noOfCompany];

        for(int i = 0; i < noOfCompany; i++) {
            System.out.println("Enter current stock price of the company: " + (i + 1));
            sharePrice[i] = in.nextDouble();
            System.out.println("Whether company's stock price rose today compare to yesterday? ");
            profit[i] = in.nextBoolean();
        }

        MergeSortImplementation Sort = new MergeSortImplementation();
        Sort.mergeSort(sharePrice, 0, sharePrice.length);

        DisplayOrder displayOrder = new DisplayOrder();

        LinearSearchForProfit linearSearchForProfit = new LinearSearchForProfit();
        int countProfit = linearSearchForProfit.countTheProfit(profit);

        BinarySearchImplementation searchImplementation = new BinarySearchImplementation();

        do {
            System.out.println("\n\n----------------------------------------");
            System.out.println("Enter the operation that you want perform: ");
            System.out.println("1. Display the companies stock prices in ascending order");
            System.out.println("2. Display the companies stock prices in descending order");
            System.out.println("3. Display the total no of companies for which stock prices rose today");
            System.out.println("4. Display the total no of companies for which stock prices declined today");
            System.out.println("5. Search a specific stock price");
            System.out.println("6. press 0 to exit");
            System.out.println("----------------------------------------");

            option = in.nextInt();

            switch(option) {

                case 0: {
                    option = 0;
                    break;
                }

                case 1: {
                    displayOrder.displayInAscendingOrder(sharePrice);
                    break;
                }

                case 2: {
                    displayOrder.displayInDescendingOrder(sharePrice);
                    break;
                }

                case 3: {
                    System.out.println("Total no of companies whose stock price rose today: " + countProfit);
                    break;
                }

                case 4: {
                    System.out.println("Total no of companies whose stock price declined today: " + (profit.length - countProfit));
                    break;
                }

                case 5: {
                    System.out.println("Enter the key value: ");
                    double key = in.nextDouble();
                    if(searchImplementation.search(sharePrice, key)) {
                        System.out.println("Stock of value " + key + " is present");
                    } else {
                        System.out.println("Value not found");
                    }
                    break;
                }

                default: {
                    System.out.println("Enter valid option");
                }
            }

        } while(option != 0);
        System.out.println("Exited successfully");
    }
}
