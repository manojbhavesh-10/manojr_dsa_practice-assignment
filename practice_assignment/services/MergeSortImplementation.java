package practice_assignment.services;

public class MergeSortImplementation {

    public void mergeSort(double[] sharePrice, int s, int e) {
        if(e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;

        mergeSort(sharePrice, s, mid);
        mergeSort(sharePrice, mid, e);

        merge(sharePrice, s, mid, e);
    }

    private void merge(double[] sharePrice, int s, int m, int e) {
        double[] mix = new double[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e) {
            if(sharePrice[i] < sharePrice[j]) {
                mix[k] = sharePrice[i];
                i++;
            } else {
                mix[k] = sharePrice[j];
                j++;
            }
            k++;
        }

        while(i < m) {
            mix[k] = sharePrice[i];
            i++;
            k++;
        }

        while(j < e) {
            mix[k] = sharePrice[j];
            j++;
            k++;
        }

        for (int index = 0; index < mix.length; index++) {
            sharePrice[s + index] = mix[index];
        }
    }
}
