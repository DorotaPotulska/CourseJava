package GroupLayout;

import javax.swing.*;

public class Main extends JFrame {

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");

    public Main(){
        this.setBounds(300,300,300,200);

        initComponents();

        this.setDefaultCloseOperation(3);
    }

    public void initComponents(){

        GroupLayout layout = new GroupLayout(getContentPane());

        this.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(button1)
                        .addGroup(
                            layout.createParallelGroup().addComponent(button1).addComponent(button4)
                        )
                .addComponent(button3)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                        layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3)
                )
                .addComponent(button4)
        );

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
