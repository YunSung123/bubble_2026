package _my.test03;

import javax.swing.*;

public class BubbleGameMain extends JFrame {

    private JLabel backGroundMap;
    private Player player;

    public BubbleGameMain() {
        initData();
        setInitLayout();

        CharacterThread thread = new CharacterThread(player);
        thread.start();

        setVisible(true);
    }

    private void initData() {
        setTitle("보글보글 게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        backGroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        backGroundMap.setLayout(null); // 절대 배치
        setContentPane(backGroundMap);

        player = new Player();
    }

    private void setInitLayout() {
        backGroundMap.add(player);
    }

    public static void main(String[] args) {
        new BubbleGameMain();
    }
}