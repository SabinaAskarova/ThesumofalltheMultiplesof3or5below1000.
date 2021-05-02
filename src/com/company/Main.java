package com.company;

public class Main {

    public static void main(String[] args) {
	// the sum of all the multiples of 3 or 5 below 1000.
     int sum=0;
     for (int i=0;i<1000;i++){
         if (i%3==0 || i%5==0){
             sum+=i;
         }
     }
        System.out.println("sum= "+sum);
    }
}
