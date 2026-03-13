package _my.test03;

import javax.swing.*;

public class Player extends JLabel {

    private int x;
    private int y;

    public Player() {
        x = 50;
        y = 300;

        setIcon(new ImageIcon("img/playerL.png"));
        setSize(50, 50);
        setLocation(x, y);
    }
}