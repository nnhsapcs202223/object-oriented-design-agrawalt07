import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.*;
import java.lang.reflect.Array;

public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;
    private int clicks = 0; 
    private int[] click1; 
    private int[]click2; 
    private int[] click3; 
    public TriangleComponent()
    {
        this.addMouseListener(new MouseClickListener());
        this.click1= new int[2];
        this.click2= new int[2];
        this.click3 = new int[2];
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        if(clicks>0){
        Ellipse2D circ = new Ellipse2D.Double(click1[(0)], click1[(1)], 5,5);
        g2.setColor(Color.black); 

        g2.draw(circ); }

        if(clicks == 2){
            g2.drawLine(click1[(0)], click1[(1)], click2[(0)], click2[(1)]);
        }
        else if(clicks == 3){
            g2.drawLine(click1[(0)], click1[(1)], click2[(0)], click2[(1)]);
            g2.drawLine(click2[(0)], click2[(1)], click3[(0)], click3[(1)]);
            g2.drawLine(click1[(0)], click1[(1)], click3[(0)], click3[(1)]);

            clicks =-1;

        }
    }

    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            clicks++; 
            if(clicks == 1){
                Array.set(click1,0, event.getX());
                Array.set(click1, 1, event.getY());
            }
            else if(clicks ==2){
                Array.set(click2, 0,  event.getX());
                Array.set(click2, 1, event.getY());
            }
            else if (clicks ==3){
                Array.set(click3, 0,event.getX());
                Array.set(click3, 1,event.getY()); 
            }
            repaint(); 
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }

        public void mousePressed(MouseEvent event)
        {
        }

        public void mouseReleased(MouseEvent event)
        {
        }
    }

}