package edu.ahs.robotics.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! My name is Ana!");
        Point a = new Point(9,2);
        System.out.println(a.getX() + ", " + a.getY());
        System.out.println(a);
        System.out.println(a.distanceFromOrigin());
    }
}