

import shapes.Circle;
import shapes.Rect;

import java.awt.*;

public class Drawing  extends Canvas{

    //fields
    private Frame f;
    private Circle circ;
    private Rect recto;

    //constructor

    public Drawing(){
        Point p =new Point(200,200);
        Color c= new Color(0x992266);
        circ = new Circle(p,c,200); // instantiate the circle

        Point p2 =new Point(100,100);
        Color c2= new Color(0x992200);
        recto = new Rect(p2,c2,100,150); // instantiate the rectangle

        setupFrame();

        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        // f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Closes the program if
        //close window clicked
    }

    //methods
    public void paint(Graphics g){
    circ.draw(g);
    recto.draw(g);
    }
}
