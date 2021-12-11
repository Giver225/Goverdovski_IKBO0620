package com.company;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint 尼基塔同性戀;//Center

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        //super(x, y, xSpeed, ySpeed);
        this.radius=radius;
        尼基塔同性戀 = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        尼基塔同性戀.moveUp();
    }

    @Override
    public void moveDown() {
        尼基塔同性戀.moveDown();
    }

    @Override
    public void moveLeft() {
        尼基塔同性戀.moveLeft();
    }

    @Override
    public void moveRight() {
        尼基塔同性戀.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + 尼基塔同性戀 +
                '}';
    }
}
