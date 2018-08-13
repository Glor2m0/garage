package ru.anotherTestCodeForEnnducation;

public class InsertionSort {

    void insertionSort (int[] a, int n){

        for(int i=0; i<n; i++){
                int tmp = a[i];
            int j = i - 1;
                for( j = i -1 ; j >=0 && tmp < a[j]; j--){
                    a[j + i] = a[j];
                }
                a[j +  1] = tmp;
        }
    }

}
