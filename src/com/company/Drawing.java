package com.company;

import java.awt.*;

public class Drawing  extends Canvas{

    //fields
    private Frame f;
    private Circle circ;

    //constructor

    public Drawing(){
        Point p =new Point(200,200);
        Color c= new Color(0x992266);
        circ = new Circle(p,c,200); // instantiate the circle
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
       // f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Closes the program if
        //close window clicked

        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    //methods
    public void paint(Graphics g){
    circ.draw(g);
    }
}
