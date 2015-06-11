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
public class main {

    public static void main(String[] args) {
        
        Point a;
        Point b;
        Line l;
        
        a = new Point(3, 7);
        b = new Point(25, 100);
        l = new Line(a,b);
        
        System.out.println(l.length());

    }
}
