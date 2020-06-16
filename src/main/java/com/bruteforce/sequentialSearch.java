package com.bruteforce;

public class sequentialSearch {
    
    public int version1(int num[], int k){
        int idx = 0;

        while(idx < num.length && num[idx] != k){
            idx++;
        }
        if(idx < num.length){
            return idx;
        } else {
            return -999;
        }
    }

    public int version2(int num[], int k){
        int last = num[num.length-1];
        num[num.length-1] = k;
        int idx = 0;

        while(num[idx] != k){
            idx++;
        }
        num[idx] = last;
        if(idx < num.length-1 || num[idx]== k){
            return idx;
        } else {
            return -999;
        }         
    }


    public static void main(String[] args){

        sequentialSearch seq = new sequentialSearch();

        int[] num = {5, 4, 3, 2, 1};

        System.out.println("Version 1:" +seq.version1(num, 0));
        System.out.println("Version 2:" +seq.version2(num, 9));;


    }

}