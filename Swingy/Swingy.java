import javax.swing.*;
import java.awt.event.*;
public class Swingy
{
    public static void main(String[] args){
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        
        b.setBounds(130,100,100,40);
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    b.setText(tf.getText());  
                    f.dispose();
                }
            });
        f.add(b);
        f.setTitle("Beans");
        f.add(tf);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
