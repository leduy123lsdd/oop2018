package week5_6;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel {
    private static List<Shape> shapes = new ArrayList<>();

    public static List<Shape> getShapes() {
        return shapes;
    }

    public static void addShape(Shape shape) {
        shapes.add(shape);
    }

    public static void deleteTriangle() {
        for(int i = 0;i < shapes.size();i ++) {
            if(shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
            }
        }

    }
    public static void printShapes(){
        for(Shape in : shapes) {
            System.out.println(in);
        }
    }

    public static void main(String[] args) {
        Layer test = new Layer();
        test.addShape(new Triangle());
        test.addShape(new Circle());
        test.addShape(new Circle());
        test.addShape(new Triangle());

        test.deleteTriangle();

        test.printShapes();

    }
}
