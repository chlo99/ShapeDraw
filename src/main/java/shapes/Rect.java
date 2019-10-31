package shapes;

import shapes.Shape;

import java.awt.*;

public class Rect extends Shape {
    protected int width;
    private int height; // Fields

    public Rect(Point initPos, Color col, int width, int height){ // The constructor
        super (initPos, col);
        this.width=width; // Initialize fields
        this.height=height;
    }

    @java.lang.Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }

}
