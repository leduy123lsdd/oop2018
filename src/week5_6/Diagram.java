package week5_6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Diagram extends JFrame {
    private static List<Layer> layers = new ArrayList<>();

    public static void addLayer(Layer layer) {
        layers.add(layer);
    }

    public static void deleteCircle() {
        for (int i = 0;i < layers.size();i++)
            for(int j = 0;j < layers.get(i).getShapes().size();j++) {
                if(layers.get(i).getShapes().get(j) instanceof Circle) {
                    layers.get(i).getShapes().remove(j);
                }
            }

    }
    public static void printDiagram() {
        int index = 1;
        for (Layer in : layers){
            System.out.println("layer " + index + ": ");
            in.printShapes();
            index++;
        }
    }

    public static void main(String[] args) {
        Layer layer1 = new Layer();
        layer1.addShape(new Triangle());
        layer1.addShape(new Circle());

        Layer layer2 = new Layer();
        layer2.addShape(new Circle());
        layer2.addShape(new Circle());
        layer2.addShape(new Triangle());




        Diagram test = new Diagram();
        test.addLayer(layer1);
        test.addLayer(layer2);

        //truoc khi xoa circle
        test.printDiagram();
        test.deleteCircle();

        //sau khi xoa
        test.printDiagram();


    }
}
