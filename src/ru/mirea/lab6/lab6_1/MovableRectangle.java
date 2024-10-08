package ru.mirea.lab6.lab6_1;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed &&
                topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {
        if (hasSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.out.println("The point don't have same speed");
        }
    }

    @Override
    public void moveDown() {
        if (hasSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        } else {
            System.out.println("The point don't have same speed");
        }
    }

    @Override
    public void moveLeft() {
        if (hasSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else {
            System.out.println("The point don't have same speed");
        }
    }

    @Override
    public void moveRight() {
        if (hasSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        } else {
            System.out.println("The point don't have same speed");
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft + ", " +
                "bottomRight=" + bottomRight + "}";
    }

}
