import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    public MainFrame(){
        inicomp();
    }
    private void inicomp(){
        this.setLocation(100,150);
        this.setSize(400,300);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);/*視窗按鈕關閉*/
            }
        });
    }
}
