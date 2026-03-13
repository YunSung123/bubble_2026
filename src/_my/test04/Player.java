package _my.test04;

import javax.swing.*;

public class Player extends JLabel {
    private JLabel playerLabel;
    private int x;
    private int y;


    public Player() {
        System.out.println("플레이어 생성");
        setIcon(new ImageIcon("img/playerL.png"));
        setSize(50, 50);
        setLocation(x, y);
    }

    /// getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /// setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
