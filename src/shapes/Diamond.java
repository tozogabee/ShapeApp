package shapes;

public class Diamond extends Square {

    private double angle;

    public Diamond(int a) {
        super(a);
        this.angle = 90;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.getA(),2)*Math.sin(this.angle);
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "angle - " + angle +"\nThe \"a\" side - "+this.getA()+"\nThe area - "+this.calculateArea()+"\nThe circum - "+this.calculateCircumReference()+"\n"+
                '}';
    }
}
