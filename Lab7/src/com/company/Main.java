package com.company;

public class Main {

    public static void main(String[] args) {
        MovableCircle crl = new MovableCircle(0,0,10,20,7);
        crl.moveLeft();
        crl.moveUp();
        System.out.println(crl);
    }
}
