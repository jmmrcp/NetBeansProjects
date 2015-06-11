/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author JoséM
 */
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point firstPoint, Point secondPoint) {
        p1 = firstPoint;
        p2 = secondPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2)
                + Math.pow(p2.getY() - p1.getY(), 2));
    }
    
    public double length2() {
    return Math.sqrt(Math.pow(p2.x-p1.x,2) 
            + Math.pow(p2.y-p1.y,2));
}
}
