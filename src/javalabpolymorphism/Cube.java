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
public class Cube extends ThreeDimensionalFigure {
    private double Side;
    public Cube(double s){
        Side = s;
    }
    @Override
    public double GetArea(){
        return 6*Side*Side;
    }
    @Override
    public double GetVolume(){
        return Side*Side*Side;
    }
}
