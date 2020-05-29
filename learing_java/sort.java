package learing_java;

public class sort {
    public void bubbleSort(int[] a, int n) {
        if(n <= 1) return ;
        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }

    public void insertionSort(int[] a, int n) {
        if(n <= 1) return ;
        for(int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for(; j >= 0; j--) {
                if(a[j] > value) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = value;
        }
    }

}