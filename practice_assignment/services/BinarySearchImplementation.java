package practice_assignment.services;

public class BinarySearchImplementation {
    public boolean search(double[] shareProfit, double target) {
        int s = 0;
        int e = shareProfit.length - 1;

        while(s <= e) {
            int mid = (s + e) / 2;

            if(shareProfit[mid] == target) {
                return true;
            } else if(target < shareProfit[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}
