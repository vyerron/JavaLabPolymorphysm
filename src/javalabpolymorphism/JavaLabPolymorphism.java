package javalabpolymorphism;
import java.util.ArrayList;
public class JavaLabPolymorphism {

    public static void main(String[] args) {
        ArrayList<Figure> l = new ArrayList<>();
        l.add(new Sphere(1));
        l.add(new Cube(2));
        l.add(new Circle(3));
        l.add(new Square(4));
        for (Figure f:l){
            System.out.println("Area: "+f.GetArea());
            if (f instanceof ThreeDimensionalFigure){
                System.out.println("Volume: "+((ThreeDimensionalFigure)f).GetVolume());
            }
        }
    }
    
}
