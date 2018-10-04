import javax.swing.*;
import java.awt.*;

public class uppgift3 extends uppgift1 {

    public uppgift3(){
        super();
        MyButton button = new MyButton(Color.red, Color.blue, "test1", "test2");
        this.panel.add(button.state1);
        this.panel.add(button.state2);
        this.window.add(panel);
        this.window.validate();

    }

    public static void main(String[] arg ){
        uppgift3 run = new uppgift3();

    }


}
