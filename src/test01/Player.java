package test01;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    // 플레이어의 현재 좌표 상태 값
    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    public Player(){
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerR = new ImageIcon("img/playerL.png");
    }

    private void setInitLayout() {
        x = 55;
        y = 535;
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }

    @Override
    public void left() {
        setIcon(playerL);
        System.out.println("player left() 호출");
    }

    @Override
    public void right() {
        setIcon(playerR);
        System.out.println("player Right() 호출");
    }

    @Override
    public void up() {
        System.out.println("player Up() 호출");
    }

    @Override
    public void down() {
        System.out.println("player Down() 호출");
    }
}
