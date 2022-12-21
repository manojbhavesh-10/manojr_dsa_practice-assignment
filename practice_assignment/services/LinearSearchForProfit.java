package practice_assignment.services;

public class LinearSearchForProfit {
    public int countTheProfit(boolean[] profit) {
        int count = 0;
        for(int i = 0; i < profit.length; i++) { // it checks the value of true and then count it
            if(profit[i] == true) {
                count++;
            }
        }
        return count;
    }
}
