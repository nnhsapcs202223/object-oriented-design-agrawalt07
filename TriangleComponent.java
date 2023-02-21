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
public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;
    private int clicks = 0; 
    private ArrayList<Integer> click1 = new ArrayList<Integer>(); 
    private ArrayList<Integer> click2 = new ArrayList<Integer>(); 
    private ArrayList<Integer> click3 = new ArrayList<Integer>(); 
    public TriangleComponent()
    {
        this.addMouseListener(new MouseClickListener());
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        repaint();
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        if(clicks == 1){
        Ellipse2D circ = new Ellipse2D.Double(click1.get(0), click1.get(1), 20,20);
        g2.setColor(Color.black); 
        
        g2.draw(circ); }
    }
    
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            clicks++; 
            if(clicks == 1){
            click1.add(event.getX());
            click1.add(event.getY());
            repaint();                
            }
            else if(clicks ==2){
            click2.add(event.getX());
            click2.add(event.getY());
            repaint();
            }
            else if (clicks ==3){
                click3.add(event.getX());
                click3.add(event.getY()); 
                repaint();
            }

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