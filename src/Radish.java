public class Radish extends Vegetable{

    public Radish(int fieldIndex) {
        super(fieldIndex);
        this.waterNeed = 2;
        this.price = 1500;
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
