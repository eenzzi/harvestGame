public class MerchantVisit extends Thread {

    public static boolean isMerchant = false;
    private final int visitInterval; // 방문 간격
    private final int visitDuration; // 방문 지속 시간

    public MerchantVisit(int visitInterval, int visitDuration) {
        this.visitInterval = visitInterval;
        this.visitDuration = visitDuration;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(visitInterval * 1000);
                startMerchantVisit();
                Thread.sleep(visitDuration * 1000);
                endMerchantVisit();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void startMerchantVisit() {
        System.out.println("상인이 방문했습니다.");
        isMerchant = true;
    }

    public void endMerchantVisit() {
        System.out.println("상인이 떠났습니다.");
        isMerchant = false;
    }
}
