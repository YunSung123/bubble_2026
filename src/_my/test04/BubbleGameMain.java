package _my.test04;

import javax.swing.*;

/**
 * Game Main Frame
 */
public class BubbleGameMain extends JFrame {
    private JLabel backGroundMap;
    private Player player;

    // 플레이어 만들기
    private JLabel playerLabel;
    // 생성자
    public BubbleGameMain() {
        initData();
        setInitLayout();
        new CharacterThread(player).start(); // 일단 무한 딜레이 쓰레드 넣어보기
    }

    private void initData() {
        setTitle("보글보글 게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지?
        backGroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        setContentPane(backGroundMap); // ContentPane 판넬 지정

        // 플레이어 생성하기
        player = new Player();
    }

    private void setInitLayout() {
        setLayout(null);

        setResizable(false); // 창 크기 고정
        setLocationRelativeTo(null); // 화면 정중앙 배치(프레임)

        backGroundMap.add(player); // 플레이어 붙이기

        setVisible(true);
    }

    public static void main(String[] args) {
        new BubbleGameMain();
    }
}
