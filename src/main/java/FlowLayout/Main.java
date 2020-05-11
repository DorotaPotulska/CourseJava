package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){
        this.setBounds(300,300,300,200);
        this.setDefaultCloseOperation(3);
        initComponents();
    }

    public void initComponents(){

        button1.setPreferredSize(new Dimension(100,100));
        button1.setPreferredSize(button2.getPreferredSize());
        //this.getContentPane().add(new JButton("La"), BorderLayout.PAGE_START);
        panel1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); // przyciski od prawej strony do lewej
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        //this.getContentPane().add(button1, BorderLayout.PAGE_START);
        //this.getContentPane().add(panel1, BorderLayout.PAGE_START);
        this.getContentPane().add(panel1, BorderLayout.CENTER);
    }

    //PANELE

    JPanel panel1=new JPanel(new FlowLayout(FlowLayout.CENTER));

    JButton button1= new JButton("Button 1");
    JButton button2= new JButton("Button 2");
    JButton button3= new JButton("Button 3");
    JButton button4= new JButton("Button 4");

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
