package com.bruteforce;

public class stringMatching {

    public boolean match(String[] s, String[] p){
        boolean contains = false;

        for(int i = 0; i <= s.length-p.length; i++){
            int j = 0;
            while(j < p.length && p[j].equals(s[i+j])){
                j += 1;
            }
            if(j == p.length){
                contains = true;
                break;
            } else {
                contains = false;
            }
        }

        return contains;
    }

    public static void main(String[] args){

        stringMatching mat = new stringMatching();

        String s = "venus";
        String p = "nut";
        String[] sArr = s.split("");
        String[] pArr = p.split("");
        System.out.println("Answer: " +mat.match(sArr, pArr)); 

    }
    
}