package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Book book = new Book();
        try {
            ball.setColor("red");
            ball.setMass(50);
            ball.setRadius(10);

            book.setAuthor("Block");
            book.setIsbn(110);
            book.setPageCount(25);
            book.setName("Bunch");
        } catch (Exception exception){
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(ball);
        System.out.println(book);
    }
}
