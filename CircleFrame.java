import javax.swing.JFrame;
/**
 * Write a description of class CircleFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class CircleFrame extends JFrame
{
    private CircleComponent component;

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    public CircleFrame()
    {
        this.component = new CircleComponent();
        
        this.add(component);

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Circle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    

    public static void main(String [] args)
    {
        JFrame frame = new CircleFrame();
    }
}

