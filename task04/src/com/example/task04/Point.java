package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    double distance(Point point){
        return Math.sqrt(Math.pow((this.getX() - point.getX()), 2) + Math.pow((this.getY() - point.getY()), 2));

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

