package GUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Alex
 */
public class InformationPanel extends JPanel{
    
    private JTextField inputDNA, statusMessage;
    
    InformationPanel(){
        
        this.setLayout(new GridLayout(2,2));
        
        this.add(new JLabel("Sequence description"));
        this.add(new JLabel("Status: "));
        
        this.add(inputDNA = new JTextField());
        this.add(statusMessage = new JTextField());
        statusMessage.setEditable(false);
    }
    
}