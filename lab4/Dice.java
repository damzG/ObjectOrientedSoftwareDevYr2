public class Dice {
    //Attributes
    private int faceValue;

    public Dice(){
        roll();
    }

    public void roll(){
        this.faceValue = (int) Math.floor(Math.random() * 6) + 1;
    }

    public int getFaceValue(){
        return this.faceValue;
    }
}
