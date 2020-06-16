package com.bruteforce;

public class polynomialEvaluation {
     
    public int eval(int num[], int x){
        int ans = 0;

        for(int i = num.length-1; i >= 0; i--){
            int power = 1;
            for(int j = 0; j < i; j++){
                power = power*x;
            }
            ans += num[i]*power;
        }

        return ans;
    }

    public static void main(String[] args){

        polynomialEvaluation pol = new polynomialEvaluation();

        int[] num = {1, 2, 3, 4, 5};

        System.out.print("Answer: " +pol.eval(num, 6));

    }
}