import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener {

    private int count = 0;

    private JFrame frame = new JFrame();
 
    private JPanel panel = new JPanel();

    private JButton button = new JButton("click me!");

    private JLabel label;

    

    public GUI()  {

      
        panel.setBorder( BorderFactory.createEmptyBorder( 200, 200, 200, 200));
        panel.setLayout( new GridLayout(0, 1) );
        panel.add(button);
        label = new JLabel();

        panel.add(label);

        

        button.addActionListener( this );

        frame.add( panel, BorderLayout.CENTER );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pig Latin");

        
    
        

    }

    void show() {

        frame.pack();

        frame.setVisible( true );
        
    }

@Override
    public void actionPerformed( ActionEvent e )
    {
        count++;
        label.setText( "Number of clicks: " + count );
    }
   

}
