
public class Cabbage extends Vegetable {

    public Cabbage(int fieldIndex) {
        super(fieldIndex);
        this.waterNeed = 4;
        this.price = 5000;
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