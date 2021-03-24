/*
 * Title: Practice 12
 * Name: Ezekiel P. Villadolid
 * Description: area and circumference calculator with GUI
 * Date: March 22, 2021
*/
package Practice12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Practice12 implements ActionListener{
    
    //Global Declaration
    double rad, area, circum;
    
    public  static JPanel panel;
    public  static JFrame frame;
    public  static JLabel label1,label2,label3,cirmLBL,areaLBL;
    public  static JTextField radTxtField;
    public  static JButton button;
    
    //The Main Method
    public static void main(String[] args) {
          
          //Creating Object
          frame = new JFrame();
          label1=  new JLabel();
          label2=  new JLabel();
          label3=  new JLabel();
          cirmLBL=  new JLabel();
          areaLBL=  new JLabel();        
          radTxtField = new JTextField();
          panel = new JPanel();
          button = new JButton("Compute");
          
          button.addActionListener(new Practice12());
          panel.setBorder(BorderFactory.createEmptyBorder(30,60,10,60));
          panel.setLayout(new GridLayout(0,1));
          label1.setText("Enter Circle Radius:");
          label2.setText("Circumference:");
          cirmLBL.setText("");
          label3.setText("Area:");
          areaLBL.setText("");
          
          //Adding objects to the pannel
          panel.add(label1);
          panel.add(radTxtField);
          panel.add(button);
          panel.add(label2);
          panel.add(cirmLBL);
          panel.add(label3);
          panel.add(areaLBL);
          
          frame.add(panel, BorderLayout.CENTER);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setTitle("Circumference & Area Calculator");
          frame.pack();
          frame.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //this will performs when button is cliked
        rad = Double.parseDouble(radTxtField.getText());
        
        //Formula to get the area of a circle
        area = 3.14*(rad*rad);
        
        //Formula to get the circumference of a circle
        circum = 2*3.14*rad;
        areaLBL.setText(Double.toString(area));
        cirmLBL.setText(Double.toString(circum));
        
    }
    
    
}
