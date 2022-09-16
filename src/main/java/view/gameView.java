package view;
import javax.swing.JFrame;

public class gameView extends JFrame{
    public gameView (){
        setTitle("JumpNStuff");
        setSize(800,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        gameView gv = new gameView();
    }
}
