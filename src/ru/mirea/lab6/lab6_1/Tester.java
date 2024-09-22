package ru.mirea.lab6.lab6_1;

public class Tester {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(0, 0, 5, 4);
        MovablePoint movablePoint2 = new MovablePoint(1, 1, 5, 4);
        MovableCircle movableCircle = new MovableCircle(movablePoint1.x, movablePoint1.y,
                movablePoint1.xSpeed, movablePoint1.ySpeed, 6);
        MovableRectangle movableRectangle = new MovableRectangle(movablePoint1.x, movablePoint1.y,
                movablePoint2.x, movablePoint2.y,
                movablePoint2.xSpeed, movablePoint2.ySpeed);


    }
}
