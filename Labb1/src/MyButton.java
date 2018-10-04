import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyButton extends JButton implements ActionListener {
    public JButton state1;
    public JButton state2;

    public MyButton(Color c1, Color c2, String s1, String s2){
        this.state1= new JButton(s1);
        this.state2 = new JButton(s2);
        this.state1.setOpaque(true);
        this.state2.setOpaque(true);
        this.state1.setBackground(c1);
        this.state2.setBackground(c2);
        state1.addActionListener(this);
        state2.addActionListener(this);
        state2.setVisible(false);
        state1.validate();
        state2.validate();
    }

    public void toggleState(){
        state1.setVisible(!state1.isVisible());
        state2.setVisible(!state2.isVisible());
    }

    public void actionPerformed(ActionEvent e){
        this.toggleState(); }

    /* public String toString(){
        return state1.getBackground();
    } */

}
