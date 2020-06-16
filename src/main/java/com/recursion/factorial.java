package com.recursion;

public class factorial {

    public int factorialSolver(int n){
        if(n >= 1){
            return n*factorialSolver(n-1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args){

        factorial f = new factorial();

        System.out.print(f.factorialSolver(12));

    }
    
}