package com.csc205.project1;
//* Utilize ChatGPT @ https://chat.openai.com for this assignment.
//in java,write a class that represents a point on a cartesian plane.
//*
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint (double x, double y){
        this.x = x;
        this.y = y;
    }
    public void shiftX(double x) {
        this.x += x;
    }
    public void shiftY(double y) {
        this.y += y;
    }
    public void rotate(double angle) {}
    public double distance(Point other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";

    }
}
