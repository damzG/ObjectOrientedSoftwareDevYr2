public class PairOfDice {
    private Dice dice1;
    private Dice dice2;

    public void rolls(){
        dice1.roll();
        dice2.roll();
    }

    public int getFaceValue1(){
        return dice1.getFaceValue();
    }

    public int getFaceValue2(){
        return dice2.getFaceValue();
    }
}
