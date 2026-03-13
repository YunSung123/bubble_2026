package _my.test03;

public class CharacterThread extends Thread {
    private Player player;

    public CharacterThread(Player player) {
        this.player = player;

        System.out.println("생성자 생성");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
                int startX = 0;
                while (true) {
                    startX += 10;
                    player.setLocation(startX, 300);
                    System.out.println(startX);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
