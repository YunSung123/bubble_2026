package _my.ThreadStudy;

public class PrintThread extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("쓰레드 실행중");

            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
