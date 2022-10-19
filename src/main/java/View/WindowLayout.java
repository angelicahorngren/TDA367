package View;

import Controller.MenuButtonController;
import Controller.StartButtonController;
import MenuView.LostRoundMenu;
import MenuView.StartPageMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowLayout extends JFrame {   //CardLayout?

    JFrame frame = new JFrame("Jump and Stuff");
    JPanel container = new JPanel();

    private StartPageMenu startPageMenu;
    private LostRoundMenu lostRoundMenu;
    private GameView gameView;
    StartButtonController startButtonPressed;

    JButton startButton = new JButton("Start");
    JButton playAgainButton = new JButton("Play again");
    JButton goToStartPageButton = new JButton("Go to Start page");

    CardLayout cl = new CardLayout();

    public WindowLayout(StartPageMenu SPM, LostRoundMenu LRM, GameView gv, StartButtonController startBtnC){
        this.startPageMenu = SPM;
        this.lostRoundMenu = LRM;
        this.gameView = gv;
        this.startButtonPressed = startBtnC;

        container.setLayout(cl);

        startButton.setPreferredSize(new Dimension(0, 80));
        startButton.setFont(new Font("Comic Sans", Font.BOLD, 40));
        playAgainButton.setPreferredSize(new Dimension(0, 40));
        playAgainButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        goToStartPageButton.setPreferredSize(new Dimension(0, 40));
        goToStartPageButton.setFont(new Font("Comic Sans", Font.BOLD, 20));

        startPageMenu.add(startButton, BorderLayout.SOUTH);
        lostRoundMenu.add(playAgainButton, BorderLayout.SOUTH);
        lostRoundMenu.add(goToStartPageButton, BorderLayout.NORTH);

        container.add(startPageMenu, "1");
        container.add(lostRoundMenu, "2");
        container.add(gameView, "3");
        cl.show(container,"1"); //Chooses witch screen it starts on


        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
                startButtonPressed.buttonPressed();
            }
        });

        playAgainButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
                startButtonPressed.buttonPressed();
            }
        });

        goToStartPageButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                goToStartPage();
            }
        });



        frame.add(container);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void startGame(){
        cl.show(container, "3");
    }

    public void goToStartPage(){
        cl.show(container, "1");
    }

    public void gameOver(){
        cl.show(container, "2");
    }

}



