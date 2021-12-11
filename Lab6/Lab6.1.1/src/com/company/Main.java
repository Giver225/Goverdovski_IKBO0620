package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static Boolean compare(int a, int b){
        if(a==0&&b==9) return true;
        if(a>b) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print first deck:");
        Queue<Integer> st1 = new LinkedList<Integer>();
        int tmp;
        for (int i = 0; i < 5; i++) {
            tmp = scanner.nextInt();
            st1.add(tmp);
        }
        System.out.println("Print second deck:");
        Queue<Integer> st2 = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            tmp = scanner.nextInt();
            st2.add(tmp);
        }
        int count =0;
        while (!st1.isEmpty()&&!st2.isEmpty()){
            System.out.println(st1);
            System.out.println(st2);
            if (compare(st1.peek(),st2.peek())) {
                st1.add(st2.poll());
            } else {
                st2.add(st1.poll());
            }
            count++;
            if(count>105){
                System.out.println("botva\n");
                return;
            }
        }

        if(st1.isEmpty()) System.out.println("First "+count);
        else System.out.println("Second "+count);

    }
}
