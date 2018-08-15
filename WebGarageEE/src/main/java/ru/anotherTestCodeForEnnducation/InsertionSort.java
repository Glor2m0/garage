package ru.anotherTestCodeForEnnducation;

public class InsertionSort {
//сортировака вставками
    void insertionSort (int[] a, int length){

        for(int i=0; i<length; i++){
                int tmp = a[i];
            int j = i - 1;
                for( ; j >=0 && tmp < a[j]; j--){
                    a[j + i] = a[j];
                }
                a[j +  1] = tmp;

        }
    }

}
