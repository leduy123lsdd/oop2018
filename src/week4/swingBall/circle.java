package week4.swingBall;

import java.awt.*;

public class circle extends Shaple {
    public int x = 0, y = 0;
    public int angleX = 1, angleY = 1;
    public int speed = 2;

    public int width = 100;
    public int height = 100;

    public void move() {
        if(x + angleX < 0) {
            angleX = speed;
        } else if(x + angleX > getWidth() - width) {
            //let's say our ball will be 50x50
            angleX = -speed;
        } else if(y + angleY < 0) {
            angleY = speed;
        } else if(y + angleY > getHeight() - height) {
            angleY = -speed;
        }
        x = x + angleX;
        y = y + angleY;
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(x, y, width, height);//50x50 ball
    }

    public circle(){}

    public void draw() {
        try {
            while (true) {
                this.move();
                this.repaint();
                this.repaint();
                Thread.sleep(5);
            }
        }
        catch (Exception e){
            System.out.println(e);
        };
    }


}
