import java.awt.*;
import java.awt.event.*;

public class uppgift4 extends uppgift1 { // om vi ska köra 4A behöver vi även "implements ActionListener"

    MyButton button;

    public uppgift4(){
        super();
        this.button = new MyButton(Color.red, Color.blue, "test1", "test2");
        //button.state1.addActionListener(this);
        //button.state2.addActionListener(this);
        this.panel.add(button.state1);
        this.panel.add(button.state2);
        this.window.add(panel);
        this.window.validate();

    }


    public static void main(String[] arg ){
        uppgift4 run = new uppgift4();

    }
/* finns här för att kunna köra del 4A
    public void actionPerformed(ActionEvent e){
        button.toggleState();

    } */


}
