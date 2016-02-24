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
public class Sphere extends ThreeDimensionalFigure{
    private double Radius;
    public Sphere(double r){
        Radius = r;
    }
    @Override
    public double GetVolume(){
        return 4*Math.PI*Radius*Radius*Radius/3;
    }
    @Override
    public double GetArea(){
        return 4*Math.PI*Radius*Radius;
    }
}
