/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabpolymorphism;

/**
 *
 * @author Admin
 */
public class Circle extends TwoDimensionalFigure {
    private double Radius;
    public Circle(double r){
        Radius = r;
    }
    @Override
    public double GetArea(){
        return Math.PI*Radius*Radius;
    }
}
