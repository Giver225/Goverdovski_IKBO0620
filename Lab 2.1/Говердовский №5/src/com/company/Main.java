package com.company;

import java.util.Scanner;

public class Main {
    
    public static void task2(int N){
        if (N>1) {task2(N-1);}
        System.out.println(N);
    }
    public static int task5(int N){
        return N>0 ? N%10 + task5(N/10): 0;
    }

    public static void task14(int N){
        if(N<=0) return;
        task14(N/10);
        System.out.println(N%10);
    }


    public static void main(String[] args) {
        //System.out.println(task5(24665));
        task2(10);
    }
}