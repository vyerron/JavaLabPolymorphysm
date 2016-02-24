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
public class Square extends TwoDimensionalFigure {
    private double Side;
    public Square(double s){
        Side = s;
    }
    @Override
    public double GetArea(){
        return Side*Side;
    }
}
