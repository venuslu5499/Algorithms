package com.bruteforce;

public class selectionSort {

    public String selSort(int num[]){
        String sorted = "";
        int min = 0;
        for(int i = 0; i < num.length; i++){
            min = i;
            for(int j = i+1; j < num.length; j++){
                if(num[j] < num[min]){
                    min = j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
            sorted += num[i];
        }
        return sorted;
    }

    public static void main(String[] args){

        selectionSort sel = new selectionSort();

        int[] num = {5, 4, 6, 3, 2, 1};

        System.out.println("Sorted: " +sel.selSort(num));


    }
    
}