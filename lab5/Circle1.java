public class Circle1 extends Point{
    
    private int radius;

    public Circle1(int x, int y, int r){
        super(x,y);
        setRadius(r);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadii(){
        return this.radius;
    }

    @Override
    public String toString(){
        return (super.toString() + "Radius:  " + getRadii());
    }
}
