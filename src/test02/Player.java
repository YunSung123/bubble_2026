package test02;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    // 플레이어의 현재 좌표 상태 값
    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    // 속도 상수
    private final int SPEED = 4;// 좌우 이동 속도 (픽셀)
    private final int JUMP_SPEED = 2;
    private final int JUMP_HEIGHT = 130;

    // 이동 상태 플래스
    // true = 해당 방향으로 이동중
    // false = 멈춤
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    // BubbleFrame 의 Key 이벤트에서 호출 할 수 있도로 setter 설정

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
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
        if (left) {
            return; // 이미 이동 중이면 중복 Thread 생성 방지
        }
        left = true;
        setIcon(playerL);

        new Thread(new Runnable() {
            @Override
            public void run() {
                // left가 true인 동안 계속 이동
                // keyReleased에서 setleft(false) 가 호출이 되면 while 탈출
                while (left) {
                    x -= SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void right() {
        if (right) {
            return;
        }
        right = true;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    x += SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
        setIcon(playerR);
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
