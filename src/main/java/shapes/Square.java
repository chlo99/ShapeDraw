package shapes;

import shapes.Rect;

import java.awt.*;

public class Square extends Rect {

    public Square(Point initPos, Color col, int width){ // The constructor
        super (initPos, col, width, width);
    }

}
