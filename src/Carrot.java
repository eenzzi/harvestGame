public class Carrot extends Vegetable {

    public Carrot(int fieldIndex) {
        super(fieldIndex);
        this.waterNeed = 3;
        this.price = 3000;
    }

    @Override
    public boolean sell() {
        if (this.currentWater == this.waterNeed) {
            System.out.println(this.price + "원에 작물을 팔았습니다.");
            return true;
        } else {
            return false;
        }
    }
}