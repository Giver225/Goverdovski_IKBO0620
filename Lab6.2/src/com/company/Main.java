package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        myList<Integer> ml = new myList(5);
	    int inp;
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextInt();
        while (inp!=-1){
            ml.add(inp);
            inp = scanner.nextInt();
        }

        System.out.println(ml.size());
        System.out.println(ml.isEmpty());
        System.out.println(ml);
        ml.clear();
        System.out.println(ml.isEmpty());
        System.out.println(ml);
    }
}
