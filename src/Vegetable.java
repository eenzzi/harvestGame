public class Vegetable {

    protected int waterNeed;
    protected int currentWater;
    protected int fieldIndex;
    protected int price;

    public Vegetable(int fidelIndex) {
        this.fieldIndex = fidelIndex;
        this.currentWater = 0;
    }


    public void water() {
        if (this.currentWater < this.waterNeed) {
            this.currentWater++;
            System.out.println((this.fieldIndex + 1) + "번 밭에 물을 주었습니다. 현재 물의 양: " + this.currentWater + "/" + this.waterNeed);
        } else {
            System.out.println("더 이상 물을 줄 수 없습니다.");
        }
    }

    public boolean sell() {
        if (MerchantVisit.isMerchant) {
            this.price *= 2;
        }

        if (this.currentWater == this.waterNeed) {
            System.out.println(this.price + "원에 작물을 팔았습니다.");
            return true;
        } else {
            return false;
        }
    }
}