import javax.swing.*;
import java.awt.*;
// class
public class DisplayImages {

    public static void main(String[] args) {
        // create java frame object to hold gui components
        JFrame frame = new JFrame("Display Images");
        
        // creates a java panel object with grid layout of 2 rows x 2 columns for images
        JPanel panel = new JPanel(new GridLayout(2, 2));
        
        // images added into panel, sorted with US in final panel to match figure
        panel.add(new JLabel(new ImageIcon("image/uk.gif")));
        panel.add(new JLabel(new ImageIcon("image/ca.gif")));
        panel.add(new JLabel(new ImageIcon("image/china.gif")));
        panel.add(new JLabel(new ImageIcon("image/us.gif")));
        
        // panel added to frame
        frame.add(panel);
        
        // size configurations of panel
        frame.setSize(400, 400); // size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // application exits when close
        frame.setVisible(true); // frame is visible
    }
}
