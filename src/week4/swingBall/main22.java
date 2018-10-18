package week4.swingBall;

import week4.task2.Circle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class main22  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Ball!");

        circle b = new circle();

        frame.add(b);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.draw();





    }
}
