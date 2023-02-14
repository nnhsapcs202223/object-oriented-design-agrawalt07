import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JButton; 
import javax.swing.JLabel;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
/**
 * Write a description of class ButtonViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400; 
    private final int FRAME_HEIGHT = 100; 

    private JFrame frame; 
    private JPanel panel; 
    private JButton button; 
    private JLabel label; 
    private int x; 
    public ButtonViewer(){
        this.frame = new JFrame(); 
        this.x = 0; 
        this.panel = new JPanel(); 
        this.button = new JButton("Click me"); 
        this.label = new JLabel("0 clicks");
        this.panel.add(this.label);
        this.panel.add(this.button);
        this.frame.add(this.panel);

        ClickListener listener = new ClickListener();
        
        this.button.addActionListener(listener); 

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.frame.setVisible(true); 
    }

    public static void main(String[] args){
        ButtonViewer viewer = new ButtonViewer(); 
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
            x+=1; 
            label.setText(x + "clicks"); 
        }
    }
}
