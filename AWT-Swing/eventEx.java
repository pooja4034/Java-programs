import java.awt.*;
import java.awt.event.*;

public class eventEx{

    public static void main(String args[])
    {
        Frame F1 = new Frame();
       
        Label l1 = new Label("Message");
        //l1.setBounds(20,10,10,50);

        TextField t1 = new TextField(20);
        t1.setBounds(50,50, 150,20);

        Button b1 = new Button("Display");
        b1.setBounds(50,100,60,30);

      b1.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            t1.setText("Welcome");
        }
      });

      F1.add(l1);
      F1.add(t1);
      F1.add(b1);

      F1.setSize(300,300);

      F1.setLayout(null);
      F1.setVisible(true);


    }
}