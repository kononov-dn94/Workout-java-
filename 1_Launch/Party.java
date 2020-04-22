import java.awt.*;
import java.awt.event.*;
class Party {
 
    public static void main(String[] str)
    {
        new Party().buildInvite();
    }
 
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Вечеринка у Тима");
        Button b = new Button("Ваша ставка");
        Button c = new Button("Сбросить");
        Panel p = new Panel();
        p.add(l);
        p.add(b);
        p.add(c);
        f.add(p);
        f.setVisible(true);
    } //еще код...
}
